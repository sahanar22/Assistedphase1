package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;

public class CustomEvents extends ApplicationEvent{
   
        public CustomEvents(Object source) {
      super(source);
   }
   public String toString(){
      return "This is a custom event";
   }
}
