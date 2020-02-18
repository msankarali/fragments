package com.msad.fragments

import android.util.Log

infix fun String.logError(className: String){
  Log.e(className, this)
}
