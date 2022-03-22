package org.example;

import org.protectedPackage.ProtectedData2;

public class App
{
    public static void main( String[] args )
    {
        /*
        Private Access Modifier
        Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.
        Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
        Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.
        Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.
        REF: https://www.tutorialspoint.com/java/java_access_modifiers.htm
         */
        PrivateData pd = new PrivateData(20, 45);
        pd.setRobotLocationX(21);
        pd.setRobotLocationY(44);

        /*
        Public Access Modifier
        A class, method, constructor, interface, etc. declared public can be accessed from any other class. Therefore,
        fields, methods, blocks declared inside a public class can be accessed from any class belonging to the Java Universe.
        However, if the public class we are trying to access is in a different package, then the public class still needs to
        be imported. Because of class inheritance, all public methods and variables of a class are inherited by its subclasses.
        REF: https://www.tutorialspoint.com/java/java_access_modifiers.htm
         */
        PublicData publicData = new PublicData();
        System.out.println(publicData.faldikRidge);

        /*
        Protected Access Modifier
        Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the
        subclasses in other package or any class within the package of the protected members' class.
        The protected access modifier cannot be applied to class and interfaces. Methods, fields can be declared protected,
        however methods and fields in an interface cannot be declared protected.
        Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated
        class from trying to use it.
        REF: https://www.tutorialspoint.com/java/java_access_modifiers.htm
        */

        /* This example shows that the public bool and the mission string are accessible when instantiated */
        ProtectedData protectedData = new ProtectedData();
        protectedData.missionComplete = true;
        System.out.println(protectedData.missionComplete);
        System.out.println(protectedData.getMissionObjective());

        /* But when the same information in the class is in another package, the restrictions apply. */
        ProtectedData2 pd2 = new ProtectedData2();
        pd2.missionComplete = true;
        System.out.println(pd2.missionComplete); //can be accesses and set because it's public
        //System.out.println(pd2.getMissionObjective); //missionObjective is not accessible because it's protected and in another package
    }
}
