package com.test.learning.app.test;

import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;
import com.squareup.spoon.Spoon;
import com.test.learning.app.MainActivity;

public class TestMainActivity extends ActivityInstrumentationTestCase2<MainActivity>{

    Solo solo;

    public TestMainActivity() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testClickButtons() throws InterruptedException {
        solo.clickOnButton("Click Here");
        Spoon.screenshot(getActivity(), "button1");
        solo.clickOnButton("Click Here 2");
        Spoon.screenshot(getActivity(), "button2");
    }
}