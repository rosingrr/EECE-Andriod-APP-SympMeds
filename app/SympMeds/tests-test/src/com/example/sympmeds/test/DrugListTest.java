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
    private String original;	// the original string the textviews have before starting up

    
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
        mViewName = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.symName_textView);
        mViewDescription = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.sympDesc_textView);
        original = mActivity.getString(com.example.sympmeds.R.string.unknown);	//the starting string of the textViews
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
        assertFalse(original.equals((String)mViewName.getText()));
    }
    
    /* 
	 * makes sure the textView with the symptom's description is updated
	 */
    public void testTextDescription() {
        assertFalse(original.equals((String)mViewDescription.getText()));
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
