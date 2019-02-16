package org.kotlin.mpp.mobile

actual fun platformName(): String {
  return "Android " + android.os.Build.VERSION.SDK_INT
}
