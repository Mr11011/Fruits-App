package com.example.fruit

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class DataModel(val FruitName: String?, val Description: String?, val Image: Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(FruitName)
        parcel.writeString(Description)
        parcel.writeInt(Image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataModel> {
        override fun createFromParcel(parcel: Parcel): DataModel {
            return DataModel(parcel)
        }

        override fun newArray(size: Int): Array<DataModel?> {
            return arrayOfNulls(size)
        }
    }

}