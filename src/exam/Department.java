package exam;

/*
2. Create a Department class in "exam" package containing
    the following instance variables, which are all private:
    (1) code: int (auto-generated starting from 400 onward).
    (2) title: String (can not be changed after initialization).
    (3) staff: Person[].
    (4) count: int, for keeping track of the number of staff in the array.
*/

public class Department {
    /*
2.1) Create a constructor: Department(String title) where
    (a) This constructor will auto-generate the code starting from 400 onward.
    (b) The title must not be null or blank. Use your old school name as the default.
    (c) Initialize the staff as an array of size equals to 10 + your date of birth (the date only).
*/


/*
    2.2) Create three public getters for code, title, and count. No setter.
*/


/*
2.3) Create a public method: addStaff(String firstname, String lastname, int type).
    This method will create a Person (without checking the type), add this person
    into the staff array, and return true. However, if the array is full or the firstname
    or the lastname is null or blank, do not create a Person but return false instead.
*/

/*
2.4) Create a public method: getTypeCount(int type): int. This method will return
    the number of staffs that have type equals to the input argument.
*/

/*
2.5) Create a public method: getAllCodes(): int[]. This method will return an array
    containing the codes of all staffs and the size of the array must be the same as
    the number of staffs in the department.
*/

/*
2.6) Create a public method: getStaff(int code): Person. This method will return
    the person in the staff array that match the code in the argument.
    Null will be returned if no staff with that code.
*/

/*
2.7) Override a public method: toString(): String. This method will return
    a string representation of the department in the following format.
    [Department: CODE (TITLE) COUNT] where CODE, TITLE, and COUNT
    are the code, the title, and the number of staffs in the department respectively.
*/


    /*
    2.8) Create a public method: getAllTypes(): int[]. This method will return an array
        containing all types of staffs in the department. Make sure that there are
        no duplicate types in the array and the size of the array equals to the number
        of distinct types.
    */
}
