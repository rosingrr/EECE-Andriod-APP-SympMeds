/**
 * 
 */
package com.example.sympmeds.test;

import com.example.sympmeds.DrugList;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * @author Randy
 *
 */
public class DrugListTest extends ActivityInstrumentationTestCase2<DrugList> {

    private DrugList mActivity;		// the activity under test
    private TextView mViewName;			// the activity's TextView (for the symptom name)
    private TextView mViewDescription;			// the activity's TextView (for the symptom description)
    private String none;	// an empty string

    
	/**
	 * calls the superclass's constructor
	 */
	public DrugListTest() {
		super(DrugList.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp(); // calls the superclass's setUp()
        mActivity = this.getActivity(); //DrugList
        mViewName = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.textView2);
        mViewDescription = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.textView3);
        none = "";	//the starting string of the textViews
	}

	/* 
	 * makes sure the textViews under test later are not null
	 */
    public void testPreconditions() {
        assertNotNull(mViewName);
        assertNotNull(mViewDescription);
    }
    
    /* 
	 * makes sure the textView with the symptom's name is updated
	 */
    public void testTextName() {
        assertFalse(none.equals((String)mViewName.getText()));
    }
    
    /* 
	 * makes sure the textView with the symptom's description is updated
	 */
    public void testTextDescription() {
        assertFalse(none.equals((String)mViewDescription.getText()));
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
