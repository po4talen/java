package com.igor.test.addressbook;

import org.testng.annotations.Test;

  public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
      goToGroupPage("groups");
      selectGroup();
      deleteGroups();
      goToGroupPage("group page");
    }

  }


