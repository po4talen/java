package com.igor.test.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage("groups");
    initGroupCreation();
    fillGroupForm(new DataGroup("test1", "test2", "test3"));
    submitGroupCreation();
    goToGroupPage("group page");
  }
}


