/*
 * Copyright 2015 NECTEC
 * National Electronics and Computer Technology Center, Thailand
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

package th.or.nectec.domain.thai;


public class ThaiAddressPrinter {

    public static String buildFullAddress(String subdistrict, String district, String province) {
        String address = "";
        if (!province.isEmpty()) {
            if (province.equals("กรุงเทพมหานคร")) {
                if (subdistrict.isEmpty()) {
                    address += "แขวง" + subdistrict + " ";
                }
                if (!district.isEmpty()) {
                    address += "เขต" + district + " " + province;
                }
            } else {
                if (!subdistrict.isEmpty()) {
                    address += "ตำบล" + subdistrict + " ";
                }
                if (!district.isEmpty()) {
                    address += "อำเภอ" + district + " จังหวัด" + province;
                }
            }
        }
        return address;
    }

    public static String buildShortAddress(String subdistrict, String district, String province) {
        String address = "";
        if (!province.isEmpty()) {
            if (province.equals("กรุงเทพมหานคร")) {
                if (subdistrict.isEmpty()) {
                    address += "แขวง" + subdistrict + " ";
                }
                if (!district.isEmpty()) {
                    address += "เขต" + district + " " + province;
                }
            } else {
                if (!subdistrict.isEmpty()) {
                    address += "ต." + subdistrict + " ";
                }
                if (!district.isEmpty()) {
                    address += "อ." + district + " จ." + province;
                }
            }
        }
        return address;
    }


}
