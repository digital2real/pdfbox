/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.fontbox.cff;

/**
 * This is specialized CFFEncoding. It's used if the EncodingId of a font is set to 0.
 * 
 * @author Villu Ruusmann
 */
public final class CFFStandardEncoding extends CFFEncoding
{
    private static final int CHAR_CODE = 0;
    private static final int CHAR_SID = 1;
    
    private CFFStandardEncoding()
    {
        // Table of character codes and their corresponding sid.
        int[][] CFF_STANDARD_ENCODING_TABLE = {
                {0, 0},
                {1, 0},
                {2, 0},
                {3, 0},
                {4, 0},
                {5, 0},
                {6, 0},
                {7, 0},
                {8, 0},
                {9, 0},
                {10, 0},
                {11, 0},
                {12, 0},
                {13, 0},
                {14, 0},
                {15, 0},
                {16, 0},
                {17, 0},
                {18, 0},
                {19, 0},
                {20, 0},
                {21, 0},
                {22, 0},
                {23, 0},
                {24, 0},
                {25, 0},
                {26, 0},
                {27, 0},
                {28, 0},
                {29, 0},
                {30, 0},
                {31, 0},
                {32, 1},
                {33, 2},
                {34, 3},
                {35, 4},
                {36, 5},
                {37, 6},
                {38, 7},
                {39, 8},
                {40, 9},
                {41, 10},
                {42, 11},
                {43, 12},
                {44, 13},
                {45, 14},
                {46, 15},
                {47, 16},
                {48, 17},
                {49, 18},
                {50, 19},
                {51, 20},
                {52, 21},
                {53, 22},
                {54, 23},
                {55, 24},
                {56, 25},
                {57, 26},
                {58, 27},
                {59, 28},
                {60, 29},
                {61, 30},
                {62, 31},
                {63, 32},
                {64, 33},
                {65, 34},
                {66, 35},
                {67, 36},
                {68, 37},
                {69, 38},
                {70, 39},
                {71, 40},
                {72, 41},
                {73, 42},
                {74, 43},
                {75, 44},
                {76, 45},
                {77, 46},
                {78, 47},
                {79, 48},
                {80, 49},
                {81, 50},
                {82, 51},
                {83, 52},
                {84, 53},
                {85, 54},
                {86, 55},
                {87, 56},
                {88, 57},
                {89, 58},
                {90, 59},
                {91, 60},
                {92, 61},
                {93, 62},
                {94, 63},
                {95, 64},
                {96, 65},
                {97, 66},
                {98, 67},
                {99, 68},
                {100, 69},
                {101, 70},
                {102, 71},
                {103, 72},
                {104, 73},
                {105, 74},
                {106, 75},
                {107, 76},
                {108, 77},
                {109, 78},
                {110, 79},
                {111, 80},
                {112, 81},
                {113, 82},
                {114, 83},
                {115, 84},
                {116, 85},
                {117, 86},
                {118, 87},
                {119, 88},
                {120, 89},
                {121, 90},
                {122, 91},
                {123, 92},
                {124, 93},
                {125, 94},
                {126, 95},
                {127, 0},
                {128, 0},
                {129, 0},
                {130, 0},
                {131, 0},
                {132, 0},
                {133, 0},
                {134, 0},
                {135, 0},
                {136, 0},
                {137, 0},
                {138, 0},
                {139, 0},
                {140, 0},
                {141, 0},
                {142, 0},
                {143, 0},
                {144, 0},
                {145, 0},
                {146, 0},
                {147, 0},
                {148, 0},
                {149, 0},
                {150, 0},
                {151, 0},
                {152, 0},
                {153, 0},
                {154, 0},
                {155, 0},
                {156, 0},
                {157, 0},
                {158, 0},
                {159, 0},
                {160, 0},
                {161, 96},
                {162, 97},
                {163, 98},
                {164, 99},
                {165, 100},
                {166, 101},
                {167, 102},
                {168, 103},
                {169, 104},
                {170, 105},
                {171, 106},
                {172, 107},
                {173, 108},
                {174, 109},
                {175, 110},
                {176, 0},
                {177, 111},
                {178, 112},
                {179, 113},
                {180, 114},
                {181, 0},
                {182, 115},
                {183, 116},
                {184, 117},
                {185, 118},
                {186, 119},
                {187, 120},
                {188, 121},
                {189, 122},
                {190, 0},
                {191, 123},
                {192, 0},
                {193, 124},
                {194, 125},
                {195, 126},
                {196, 127},
                {197, 128},
                {198, 129},
                {199, 130},
                {200, 131},
                {201, 0},
                {202, 132},
                {203, 133},
                {204, 0},
                {205, 134},
                {206, 135},
                {207, 136},
                {208, 137},
                {209, 0},
                {210, 0},
                {211, 0},
                {212, 0},
                {213, 0},
                {214, 0},
                {215, 0},
                {216, 0},
                {217, 0},
                {218, 0},
                {219, 0},
                {220, 0},
                {221, 0},
                {222, 0},
                {223, 0},
                {224, 0},
                {225, 138},
                {226, 0},
                {227, 139},
                {228, 0},
                {229, 0},
                {230, 0},
                {231, 0},
                {232, 140},
                {233, 141},
                {234, 142},
                {235, 143},
                {236, 0},
                {237, 0},
                {238, 0},
                {239, 0},
                {240, 0},
                {241, 144},
                {242, 0},
                {243, 0},
                {244, 0},
                {245, 145},
                {246, 0},
                {247, 0},
                {248, 146},
                {249, 147},
                {250, 148},
                {251, 149},
                {252, 0},
                {253, 0},
                {254, 0},
                {255, 0}
        };
        for (int[] encodingEntry : CFF_STANDARD_ENCODING_TABLE)
        {
            add(encodingEntry[CHAR_CODE], encodingEntry[CHAR_SID]);
        }
    }

    /**
     * Returns an instance of the CFFStandardEncoding class.
     * @return an instance of CFFStandardEncoding
     */
    public static CFFStandardEncoding getInstance()
    {
        return CFFStandardEncoding.INSTANCE;
    }

    private static final CFFStandardEncoding INSTANCE = new CFFStandardEncoding();

}
