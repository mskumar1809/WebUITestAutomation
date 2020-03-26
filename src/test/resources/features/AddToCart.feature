@AddToCart
Feature: To Test the add to cart functionality

    @addtocart
  Scenario Outline: To verify the basic functionality of add to cart for "<dress name>"
    Given the user is on the home page "http://automationpractice.com/index.php"
    When the user logs into the application successfully with "mskumar0918@gmail.com" and "Helloworld1234"
    And the user clicks on the "Women" button
    And the user chooses the products with desired details "<dress name>", "<quantity>", "<size>"
    And the user clicks on the "cart" button
    Then the user should see the Shopping-Cart with selected values of "<dress name>", "<quantity>" and "<size>"
    When the user edits the Shopping-Cart with "<updated_quantity>"
    Then the user should see the Shopping-Cart with updated values "<dress name>" "<updated_quantity>"

      Examples:
      | dress name                                                      | quantity    | size       | updated_quantity |
      | Faded Short Sleeve T-shirts, Blouse                             | 1, 5        | S, L       |  4, 0            |
      | Blouse, Printed Dress, Printed Summer Dress1, Printed Dress1    | 1, 3, 4, 7  | S, M, L, S |  1, 3, 0, 7     |
      |Printed Dress1                                                   | 1           |  M         |   0              |
      |Printed Summer Dress                                             | 1           |  L         |      4           |


