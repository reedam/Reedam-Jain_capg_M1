package com.cpg.lab2.exercise;
abstract class WrittenItem extends Item{
private String author;
public WrittenItem(int idNum, String str, int n, String author2, int y) {
	// TODO Auto-generated constructor stub
}
public WrittenItem() {
	// TODO Auto-generated constructor stub
}
void setAuthor(String str){
author = str;
}
String getAuthor(){
return author;
}
public int getIdNum(){
return super.getidNum();
}
public String getTitle(){
return super.getTitle();
}
public int getNumCopies(){
return super.getCopies();
}
public boolean equals(Object obj){
if(obj == null)
return false;
WrittenItem otherWrittenItem = (WrittenItem) obj;
return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
}
}
  