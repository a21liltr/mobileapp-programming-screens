
# Rapport

Forked down project and created a new layout resource file in layout folder called activity_two.xml, this will be used as a layout of something similar to a second page when compared to a website.

A new class is then created and given the name SecondActivity.java to be descriptive of what its purpose will be.

Viewbinding is added for more easily read code.

Created a method for changing activities in MainActivity.java, going from main to activity two.
This is just for test purposes to see how Intents work.

In SecondActivity.java, an onClick method is added to call finish(); method which is used to close activity two when the user wants to go back to the first activity ("page").

An EditText component is added to main activity, where users can make an input which is then passed to activity two and displayed.
This is achieved using the intent putExtra method to bind a name (chosen keyword) to the data that is to be passed to activity two.

In SecondActivity, getIntent.getStringExtra with the chosen keyword is used to get and save the data in a String variable.

User can now input text in EditText component in main activity and click a button, which then starts activity two and displays the same text that the used had input earlier.
When clicking a button with value "Go Back" in activity two, the activity will be closed and the user will be returned to the main activity.
