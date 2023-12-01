
import java.util.*;
class LinkedList
{
Node head;
static class Node {
int data;
Node next;
// parametrized constructor
Node(int data) 
{
this.data = data;
this.next = null;
}
}
void insertTail(int data) {
Node newNode = new Node(data);
if (this.head == null) {
// list is empty
this.head = newNode;
} else {
// list is not empty
    //thead temporary pointer
Node thead = this.head;
while (thead.next != null) {
thead = thead.next;
}
thead.next = newNode;
}
}
void printList() {
Node thead = this.head; // this -> list
while (thead != null) {
System.out.print(thead.data + " -> ");
thead = thead.next;
}
}
void insertHead(int data) {
// 1. create a new node
// create an object to the class
Node newNode = new Node(data);
// 2. update the newNode



// store the address of head to newNode.next
newNode.next = this.head;
// 3. change the head
this.head = newNode;
}
/**
* The function should return the length or number of nodes
* in the list
*/
int length() {
int count =0;
Node current =this.head;
while( current !=null)
{
count++;
current =current.next;
}
return count;
}
int count(int data) {
// initialize a count variable to
// to keep track of the number of times data exists
int nodes = 0;
Node thead = this.head;
while (thead != null) {
if (thead.data == data) {
nodes++;
}
thead = thead.next;
}
return nodes;
}
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
// how to create an object to the class
System.out.println("PROGRAM TO FIND THE LENGTH OF THE LINKED LIST");
System.out.println("ENTER THE VALUES TO FIND THE LENTH OF THE LINKED LIST");
LinkedList list = new LinkedList();
String line = in.nextLine();
String array[] = line.split("\\s+");


int numArray[] = new int[array.length];
for (int i = 0; i<array.length; i++) {
numArray[i] = Integer.parseInt(array[i]);
}
for (int i = 0; i<numArray.length; i++) {
list.insertHead(numArray[i]);
}
System.out.println("LENGTH OF THE LINKED LIST IS:" + list.length());
// uncomment the following line to print the linked list
// list.printList();
in.close();
}
}