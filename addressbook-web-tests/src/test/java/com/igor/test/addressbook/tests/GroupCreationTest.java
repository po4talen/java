package com.igor.test.addressbook.tests;

import com.igor.test.addressbook.model.DataGroup;
import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage("groups");
    app.initGroupCreation();
    app.fillGroupForm(new DataGroup("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.goToGroupPage("group page");
  }
}


