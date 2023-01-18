package com.willi_vstn.view_pager;

public enum ModelCourse {
    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private final int mTitleID;
    private final int mLayoutID;

    ModelCourse(int mTitleID, int mLayoutID) {
        this.mTitleID = mTitleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTitleID() {
        return mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }
}
