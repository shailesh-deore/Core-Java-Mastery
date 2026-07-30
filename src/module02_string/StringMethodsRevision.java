package module02_string;


/*
=============================================================
            JAVA STRING METHODS REVISION
=============================================================

Methods Covered
1. length()
2. charAt()
3. substring()
4. equals()
5. equalsIgnoreCase()
6. toUpperCase()
7. toLowerCase()
8. contains()
9. startsWith()
10. endsWith()
11. indexOf()
12. lastIndexOf()
13. replace()
14. trim()
15. split()
=============================================================
*/


public class StringMethodsRevision {


    public static void main(String[] args) {

        // =====================================================
        // 1. length()
        // Definition : Returns total number of characters.
        // Return Type : int
        // Syntax      : str.length()
        // =====================================================
        String name = "Shailesh";
        System.out.println(name.length()); // 9

        // =====================================================
        // 2. charAt()
        // Definition : Returns character at given index.
        // Return Type : char
        // Last index = length()-1
        // =====================================================
        String city = "Jalgaon";
        System.out.println(city.charAt(0));                 // J
        System.out.println(city.charAt(city.length() - 1)); // n

        // Loop Example
        for (int i = 0; i < city.length(); i++) {
            System.out.print(city.charAt(i));
        }
        System.out.println();

        // Reverse Loop
        for (int i = city.length() - 1; i >= 0; i--) {
            System.out.print(city.charAt(i));
        }
        System.out.println();

        // =====================================================
        // 3. substring()
        // Definition : Extracts part of String.
        // Return Type : String
        // beginIndex included
        // endIndex excluded
        // =====================================================
        String course = "Java Programming";
        System.out.println(course.substring(0,4)); // Java
        System.out.println(course.substring(5));   // Programming

        // =====================================================
        // 4. equals()
        // Definition : Compares actual content.
        // Return Type : boolean
        // Case Sensitive
        // =====================================================
        System.out.println("Java".equals("Java"));

        // =====================================================
        // 5. equalsIgnoreCase()
        // Ignores upper/lower case.
        // Return Type : boolean
        // =====================================================
        System.out.println("Java".equalsIgnoreCase("java"));

        // =====================================================
        // 6. toUpperCase()
        // Return Type : String
        // =====================================================
        System.out.println("java".toUpperCase());

        // =====================================================
        // 7. toLowerCase()
        // Return Type : String
        // =====================================================
        System.out.println("JAVA".toLowerCase());

        // =====================================================
        // 8. contains()
        // Return Type : boolean
        // =====================================================
        System.out.println("Java Programming".contains("Java"));

        // =====================================================
        // 9. startsWith()
        // Return Type : boolean
        // =====================================================
        System.out.println("Java".startsWith("Ja"));

        // =====================================================
        // 10. endsWith()
        // Return Type : boolean
        // =====================================================
        System.out.println("Java".endsWith("va"));

        // =====================================================
        // 11. indexOf()
        // First occurrence
        // Return Type : int
        // Not found -> -1
        // =====================================================
        String word = "Programming";
        System.out.println(word.indexOf('g'));

        // =====================================================
        // 12. lastIndexOf()
        // Last occurrence
        // Return Type : int
        // =====================================================
        System.out.println(word.lastIndexOf('g'));

        // =====================================================
        // 13. replace()
        // Return Type : String
        // Original String never changes (Immutable)
        // =====================================================
        System.out.println("banana".replace('a','o'));
        System.out.println("Java Programming".replace("Java","Python"));

        // =====================================================
        // 14. trim()
        // Removes only leading & trailing spaces.
        // Middle spaces are NOT removed.
        // Return Type : String
        // =====================================================
        String user = "   Shailesh Patil   ";
        System.out.println(user.trim());

        // =====================================================
        // 15. split()
        // Breaks one String into many Strings.
        // Return Type : String[]
        // Separator Required
        // =====================================================
        String skills = "Java,Spring Boot,SQL";
        String[] arr = skills.split(",");

        for(int i=0;i<arr.length;i++){
            System.out.println("Index " + i + " : " + arr[i]);
        }

        // =====================================================
        // METHOD CHAINING
        // One method's returned object is used by next method.
        // Chain continues only if next method exists
        // on returned type.
        // =====================================================
        String text = "   java programming   ";
        System.out.println(text.trim().toUpperCase().substring(5).length());

        // =====================================================
        // IMPORTANT DIFFERENCE
        // String -> length()
        // Array  -> length
        // =====================================================
        System.out.println(text.length());
        System.out.println(arr.length);
    }
}

