## Craft - cost sharing app

1.     A single person tends to pay a bill (at a restaurant, etc) when they go out in a group and 
       they expect to settle the sharing later.
       
2.     When a group of people plan for a trip or similar multiple people spend on multiple items the cost of 
       which needs to be shared later. In such scenarios tracking of settlements becomes a challenge. 
  
### Major Requirements
  
       a)    What the user owes to others or vice versa
  
       b)    Should be able to drill down and understand why the settlement amount is X.
  
       c)    Should be able to view expenses for an event

### Usecases
  
       a)    Create an event
  
       b)    Add users to event
       
       c)    User to add spendings
       
       d)    Aggregate spending by each user/ total expense
       
       e)    Divide the aggregare appropriately across the group
       
### High-level backend Design Elements
       
       -      Event [NEW/ACTIVE/SETTLEMENT/CLEARED]
       -      User
       -      Event-User
       -      Event-User-txn (partitioned across cluster)
       -      Event-User-settle
       -      Reports (Partitioned materialized views that could be refreshed at varying intervals)
       -      The EVENTS in CLEARED state, could be moved to document database 
               _event document containing all details for a given event_
       
 ### High-level REST APIs
 
       -      /events
                     POST - would create a new event
                     GET - could return all events
       
       -      /events/<eventid>
                     GET - could return event details (with/without txn details)
                     PUT - calculates, settlement of accounts w.r.t event-users.
                     DELETE - could delete the event
                           
       -      /events/<eventid>/users
                     GET - would return all users
                     POST - would create a new user
                   
        -     /events/<eventid>/users/<userid>
                     GET - would get user details for the given event
                     DELETE - could delete the user from the given event
                     
         -    /events/<eventid>/users/<userid>/txns
                     GET - would get details of event/user txn
                     POST - would add amount to event/user txn
                     
          -   /events/<eventid>/txns (same as get of event with txn details)
                     GET - would get txn details for the given <event id>
                     
           -  /events/<eventid>/settle (same as put of event)
                     PUT - calculates, settlement of accounts w.r.t event-users. 
                     Populates event_user_settle table with details.
                    
            Note: All the APIs are stateless hence can horizontally scale across the cluster
       
### Backend Design Elements       

 ![](https://github.com/sudvarma/craft/blob/master/er_craft.png)
 
 - event user txn table is going to be largest table and has to be partioned and should be made append only - no updates
 - event_user_spend_summary materialized view would give summary of money spend by each user for an event.
   It could be refresh offline or per request from the txn table and need not be done for each txn.
 - user_profile could be another materialized view that tracks all user spending/payout. Refreshed once in a day max. 

### High level Class & Design

### Settlement Process
   
   The focus is in reducing the number of transactions.Below is an example settlement process:-
    
   ![](https://github.com/sudvarma/craft/blob/master/SettlementStep2.png)
    
### Enhancements
       
   -  Provide provision to transfer money from the app
   -  Public profile of user based on spending/return policies
   -  Could include provision for ads/recommendation for additional monetization options
