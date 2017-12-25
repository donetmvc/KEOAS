package com.eland.p2shop.keoas.Activity

import android.Manifest
import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.eland.p2shop.keoas.R
import permissions.dispatcher.*

/**
 * Created by liuwenbin on 2017/12/14.
 * 虽然青春不在，但不能自我放逐.
 */

@RuntimePermissions
open class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkAppPermission()
    }

    private fun checkAppPermission() {
        if(!PermissionUtils.hasSelfPermissions(this, READ_PHONE_STATE_PERMISSION)) {
            showPhoneStateWithPermissionCheck()
        }

        if(!PermissionUtils.hasSelfPermissions(this, CAMERA_PERMISSION)) {
            showCameraWithPermissionCheck()
        }
    }

    @SuppressLint("NeedOnRequestPermissionsResult")
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // NOTE: delegate the permission handling to generated method
        onRequestPermissionsResult(requestCode, grantResults)
//        when(permissions.first()) {
//            READ_PHONE_STATE_PERMISSION -> showCameraWithPermissionCheck()
//        }
    }

    @NeedsPermission(READ_PHONE_STATE_PERMISSION)
    fun showPhoneState() {

    }

    @NeedsPermission(CAMERA_PERMISSION)
    fun showCamera() {

    }

    @OnPermissionDenied(READ_PHONE_STATE_PERMISSION)
    fun onPhoneStateDenied() {
        Toast.makeText(this, R.string.permission_camera_denied, Toast.LENGTH_SHORT).show()
    }

    @OnNeverAskAgain(READ_PHONE_STATE_PERMISSION)
    fun onPhoneStateNeverAskAgain() {
        Toast.makeText(this, R.string.permission_camera_never_askagain, Toast.LENGTH_SHORT).show()
    }

    @OnPermissionDenied(CAMERA_PERMISSION)
    fun onCameraDenied() {
        Toast.makeText(this, R.string.permission_camera_denied, Toast.LENGTH_SHORT).show()
    }

    @OnNeverAskAgain(CAMERA_PERMISSION)
    fun onCameraNeverAskAgain() {
        Toast.makeText(this, R.string.permission_camera_never_askagain, Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val READ_PHONE_STATE_PERMISSION: String = Manifest.permission.READ_PHONE_STATE
        const val CAMERA_PERMISSION: String = Manifest.permission.CAMERA
    }

}