# bottom_navigation_bar_trial
this is trail project in whci ive implemented the   andoird concepts like view binding in fragment, anomations betwn fragments and bottom navbar controller


this is trail project in whci ive implemented the   andoird concepts like 

- view binding in fragment
- anomations betwn fragments 
- bottom navigation bar   [bottom navbar controller which controls the change in fragments(tabs like feed,profile,chats,home)  ]



![Annotation 2021-07-05 034251](https://user-images.githubusercontent.com/58788722/124400834-19c7bd80-dd43-11eb-94d1-3cf30000c06d.png)


![Annotation 2021-07-05 034225](https://user-images.githubusercontent.com/58788722/124400824-06b4ed80-dd43-11eb-9abb-ed25a66b0d3a.png)



note :  while checking out the XML code of bottom navigration bar be careful . some diff.  changes are there.

check out below code for quick referrence : 

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
<!--     normal text view code for heading -->
    />


    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottom_nav_controller"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textview"
        app:layout_constraintVertical_bias="1.0"
        app:menu="@menu/bottom_navbar_controllers_menu"

<!--   bottom navigation bar        -->
        />
        
        *****************one of my wrong codes***************************
        
<!--    <fragment-->
<!--        android:id="@+id/fragmentContainerView"-->
<!--        android:name="com.example.retrofit__glide_app.glide"-->
<!--        android:layout_width="349dp"-->

<!--        android:layout_height="164dp"-->
<!--        android:layout_marginStart="8dp"-->
<!--        android:layout_marginLeft="8dp"-->
<!--        android:layout_marginEnd="8dp"-->
<!--        android:layout_marginRight="8dp"-->
<!--        android:layout_marginBottom="8dp"-->
<!--        app:layout_constraintBottom_toTopOf="@+id/bottom_nav_controller"-->
<!--        app:layout_constraintEnd_toEndOf="parent"-->
<!--        app:layout_constraintStart_toStartOf="parent"-->
<!--        app:layout_constraintTop_toBottomOf="@+id/textview"-->
<!--        app:layout_constraintVertical_bias="0.826"-->

<!--        tools:layout="@layout/fragment_retrofit" />-->
--> 
*****************END***************************

<!-- below is the real code to show fragments on main_activity 
take reference 
enjoy this whole code  
 & bang on the work.
-->
<fragment
        android:id="@+id/fragmentContainerView"
        android:name="androidx.navigation.fragment.NavHostFragment"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"


        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        app:defaultNavHost="true"
        app:layout_constraintBottom_toTopOf="@+id/bottom_nav_controller"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textview"
        app:layout_constraintVertical_bias="0.0"
        app:navGraph="@navigation/nav_graph" />

</androidx.constraintlayout.widget.ConstraintLayout>
