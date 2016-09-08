package seedu.addressbook.data.person;
 
 import seedu.addressbook.data.exception.IllegalValueException;
 
 public class Contact {
     
     public final String value;
     protected Boolean isPrivate;
     
     // Create Contact Object

     public Contact(String value, Boolean isPrivate) {
         this.value = value;
         this.isPrivate = isPrivate;
     }
 
     public boolean isPrivate() {
         return isPrivate;
     }
     
     @Override
     public String toString() {
         return value;
     }
     
     @Override
     public int hashCode() {
         return value.hashCode();
     }
     
 }
