package com.ankit.mediator;

public class ArticlesDialogBox extends DialogBox{
    private ListBox articlesListBox = new ListBox(this);
    private TextBox articlesTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article #1");
//        articlesTextBox.setContent("");
//        articlesListBox.setSelection("Article #2");
        System.out.println("Text title : " + articlesTextBox.getContent());
        System.out.println("Button Status : " + saveButton.getEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox){
            articleListBoxSelected();
        }else if(control == articlesTextBox){
            articleTextBoxSelected();
        }
    }

    public void articleListBoxSelected(){
        articlesTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    public void articleTextBoxSelected(){
        var content = articlesTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
