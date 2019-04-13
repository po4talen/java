package com.igor.test.addressbook.tests;

import com.igor.test.addressbook.model.DataGroup;
import org.testng.annotations.Test;

public class GroupEditorTest extends TestBase {

  @Test
  public void groupEditor(){
    app.goToGroupPage("groups");
    app.selectGroup();
    app.initGroupEditor();
    app.fillGroupForm(new DataGroup("data1","data2","data3"));
    app.submitGroupEditor();
    app.goToGroupPage("group page");
  }
}
