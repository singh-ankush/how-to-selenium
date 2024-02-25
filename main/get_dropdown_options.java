//this is a code to print all options in a dropdown menu. could be useful when verifying if desired options are present in the dropdown.

public class get_dropdown_options {
    public static void main(String[] args) {
        Select dropDown = new Select(Driver.findElement()));
        List<WebElement> e = dropDown.getOptions(); //retreives all options from the drop down
        int itemCount = e.size(); //retreives the size of the dropdown

        for(int i = 0; i < itemCount; i++)
        {
            System.out.println(e.get(i).getText()); // gets and prints options one by one
        }
        
    }
}
