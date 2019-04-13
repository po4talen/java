package com.igor.test.addressbook.tests;

import org.testng.annotations.Test;

  public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
      app.goToGroupPage("groups");
      app.selectGroup();
      app.deleteGroups();
      app.goToGroupPage("group page");
    }

  }


