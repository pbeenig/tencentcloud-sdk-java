/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceTag  extends AbstractModel{

    /**
    * 属性名称
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 属性值的类型，1 int，2 string
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 属性的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取属性名称
     * @return Tag 属性名称
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * 设置属性名称
     * @param Tag 属性名称
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * 获取属性值的类型，1 int，2 string
     * @return Type 属性值的类型，1 int，2 string
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置属性值的类型，1 int，2 string
     * @param Type 属性值的类型，1 int，2 string
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取属性的值
     * @return Value 属性的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置属性的值
     * @param Value 属性的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

