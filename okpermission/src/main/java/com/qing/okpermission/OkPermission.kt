package com.qing.okpermission

import androidx.fragment.app.FragmentActivity


object OkPermission {
    private const val TAG = "DelegateFragment"

    fun request(activity: FragmentActivity, vararg permission: String, callback: PermissionCallBack) {
        val fragmentManager = activity.supportFragmentManager
        val existedFragment =  fragmentManager.findFragmentByTag(TAG)
        val  fragment = if (existedFragment != null) {
            existedFragment as DelegateFragment
        } else {
            val delegateFragment = DelegateFragment()
            fragmentManager.beginTransaction().add(delegateFragment, TAG).commitNow()
            delegateFragment
        }
        fragment.requestPermission(callback, *permission)
    }
}