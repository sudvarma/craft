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
                     GET - could return event details
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
                     
          -   /events/<eventid>/users/txns
                     GET - would get txn details for the given <event id>
                     
           -  /events/<eventid>/settle
                     PUT - calculates, settlement of accounts w.r.t event-users. 
                     Populates event_user_settle table with details.
       
### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/sudvarma/craft/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
