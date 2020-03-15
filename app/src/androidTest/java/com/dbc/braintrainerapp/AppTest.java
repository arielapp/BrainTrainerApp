package com.dbc.braintrainerapp;


import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AppTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void firstTest() throws Exception {
        onView(withId(R.id.startButton)).perform(click());
        onView(withId(R.id.constraintLayout)).check(matches(isDisplayed()));
    }

}
