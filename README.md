# To-Do-List

here i used

to do list important topic


1)The first thing we need is a Relative Layout. I have used the relative layout since it eliminates the nested view and keeps the layout hierarchy flat.

2) using Linear Layout to place the view either horizontally or vertically. 

3) To design the app according to the sketch provided we need a TextView that displays the name of our app. We need an EditTextView which allows the user to type the list item as input. Similarly, we need three buttons “Add”, “Delete” and “Clear” to perform the desired operations. Alternatively, we can add another TextView to just represent the name of our to-do list. And finally, we need a ListView to store all the items in a list


########################################################### 
IN Kotlin Part
###########################################################


I have used ArrayList to add all the elements into a list at the specified index. And then I use an ArrayAdapter because the adapter converts the generated Arraylists of objects into the view which in this case the view is a ListView.


then in add button i have done SetOnclick listenr


for delete i use

I am using the SparseBooleanArray to iterate over the list and then retrieve the position of the indexes. Below is the code for the delete operation.
