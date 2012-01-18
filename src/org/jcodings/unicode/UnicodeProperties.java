/*
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package org.jcodings.unicode;

import org.jcodings.Config;
import org.jcodings.util.BytesHash;


public class UnicodeProperties {
    static final int[][]CodeRangeTable = Config.USE_UNICODE_PROPERTIES ?
            new int[][] {
                CR_NEWLINE.Table,
                CR_Alphabetic.Table,
                CR_Blank.Table,
                CR_Cc.Table,
                CR_Nd.Table,
                CR_Graph.Table,
                CR_Lowercase.Table,
                CR_Print.Table,
                CR_P.Table,
                CR_White_Space.Table,
                CR_Uppercase.Table,
                CR_ASCII_Hex_Digit.Table,
                CR_Word.Table,
                CR_Alnum.Table,
                CR_ASCII.Table,
                CR_Any.Table,
                CR_Assigned.Table,
                CR_C.Table,
                CR_Cc.Table,
                CR_Cf.Table,
                CR_Cn.Table,
                CR_Co.Table,
                CR_Cs.Table,
                CR_L.Table,
                CR_Ll.Table,
                CR_Lm.Table,
                CR_Lo.Table,
                CR_Lt.Table,
                CR_Lu.Table,
                CR_M.Table,
                CR_Mc.Table,
                CR_Me.Table,
                CR_Mn.Table,
                CR_N.Table,
                CR_Nd.Table,
                CR_Nl.Table,
                CR_No.Table,
                CR_P.Table,
                CR_Pc.Table,
                CR_Pd.Table,
                CR_Pe.Table,
                CR_Pf.Table,
                CR_Pi.Table,
                CR_Po.Table,
                CR_Ps.Table,
                CR_S.Table,
                CR_Sc.Table,
                CR_Sk.Table,
                CR_Sm.Table,
                CR_So.Table,
                CR_Z.Table,
                CR_Zl.Table,
                CR_Zp.Table,
                CR_Zs.Table,
                CR_Math.Table,
                CR_Alphabetic.Table,
                CR_Lowercase.Table,
                CR_Uppercase.Table,
                CR_Cased.Table,
                CR_Case_Ignorable.Table,
                CR_Changes_When_Lowercased.Table,
                CR_Changes_When_Uppercased.Table,
                CR_Changes_When_Titlecased.Table,
                CR_Changes_When_Casefolded.Table,
                CR_Changes_When_Casemapped.Table,
                CR_ID_Start.Table,
                CR_ID_Continue.Table,
                CR_XID_Start.Table,
                CR_XID_Continue.Table,
                CR_Default_Ignorable_Code_Point.Table,
                CR_Grapheme_Extend.Table,
                CR_Grapheme_Base.Table,
                CR_Grapheme_Link.Table,
                CR_Common.Table,
                CR_Latin.Table,
                CR_Greek.Table,
                CR_Cyrillic.Table,
                CR_Armenian.Table,
                CR_Hebrew.Table,
                CR_Arabic.Table,
                CR_Syriac.Table,
                CR_Thaana.Table,
                CR_Devanagari.Table,
                CR_Bengali.Table,
                CR_Gurmukhi.Table,
                CR_Gujarati.Table,
                CR_Oriya.Table,
                CR_Tamil.Table,
                CR_Telugu.Table,
                CR_Kannada.Table,
                CR_Malayalam.Table,
                CR_Sinhala.Table,
                CR_Thai.Table,
                CR_Lao.Table,
                CR_Tibetan.Table,
                CR_Myanmar.Table,
                CR_Georgian.Table,
                CR_Hangul.Table,
                CR_Ethiopic.Table,
                CR_Cherokee.Table,
                CR_Canadian_Aboriginal.Table,
                CR_Ogham.Table,
                CR_Runic.Table,
                CR_Khmer.Table,
                CR_Mongolian.Table,
                CR_Hiragana.Table,
                CR_Katakana.Table,
                CR_Bopomofo.Table,
                CR_Han.Table,
                CR_Yi.Table,
                CR_Old_Italic.Table,
                CR_Gothic.Table,
                CR_Deseret.Table,
                CR_Inherited.Table,
                CR_Tagalog.Table,
                CR_Hanunoo.Table,
                CR_Buhid.Table,
                CR_Tagbanwa.Table,
                CR_Limbu.Table,
                CR_Tai_Le.Table,
                CR_Linear_B.Table,
                CR_Ugaritic.Table,
                CR_Shavian.Table,
                CR_Osmanya.Table,
                CR_Cypriot.Table,
                CR_Braille.Table,
                CR_Buginese.Table,
                CR_Coptic.Table,
                CR_New_Tai_Lue.Table,
                CR_Glagolitic.Table,
                CR_Tifinagh.Table,
                CR_Syloti_Nagri.Table,
                CR_Old_Persian.Table,
                CR_Kharoshthi.Table,
                CR_Balinese.Table,
                CR_Cuneiform.Table,
                CR_Phoenician.Table,
                CR_Phags_Pa.Table,
                CR_Nko.Table,
                CR_Sundanese.Table,
                CR_Lepcha.Table,
                CR_Ol_Chiki.Table,
                CR_Vai.Table,
                CR_Saurashtra.Table,
                CR_Kayah_Li.Table,
                CR_Rejang.Table,
                CR_Lycian.Table,
                CR_Carian.Table,
                CR_Lydian.Table,
                CR_Cham.Table,
                CR_Tai_Tham.Table,
                CR_Tai_Viet.Table,
                CR_Avestan.Table,
                CR_Egyptian_Hieroglyphs.Table,
                CR_Samaritan.Table,
                CR_Lisu.Table,
                CR_Bamum.Table,
                CR_Javanese.Table,
                CR_Meetei_Mayek.Table,
                CR_Imperial_Aramaic.Table,
                CR_Old_South_Arabian.Table,
                CR_Inscriptional_Parthian.Table,
                CR_Inscriptional_Pahlavi.Table,
                CR_Old_Turkic.Table,
                CR_Kaithi.Table,
                CR_Batak.Table,
                CR_Brahmi.Table,
                CR_Mandaic.Table,
                CR_White_Space.Table,
                CR_Bidi_Control.Table,
                CR_Join_Control.Table,
                CR_Dash.Table,
                CR_Hyphen.Table,
                CR_Quotation_Mark.Table,
                CR_Terminal_Punctuation.Table,
                CR_Other_Math.Table,
                CR_Hex_Digit.Table,
                CR_ASCII_Hex_Digit.Table,
                CR_Other_Alphabetic.Table,
                CR_Ideographic.Table,
                CR_Diacritic.Table,
                CR_Extender.Table,
                CR_Other_Lowercase.Table,
                CR_Other_Uppercase.Table,
                CR_Noncharacter_Code_Point.Table,
                CR_Other_Grapheme_Extend.Table,
                CR_IDS_Binary_Operator.Table,
                CR_IDS_Trinary_Operator.Table,
                CR_Radical.Table,
                CR_Unified_Ideograph.Table,
                CR_Other_Default_Ignorable_Code_Point.Table,
                CR_Deprecated.Table,
                CR_Soft_Dotted.Table,
                CR_Logical_Order_Exception.Table,
                CR_Other_ID_Start.Table,
                CR_Other_ID_Continue.Table,
                CR_STerm.Table,
                CR_Variation_Selector.Table,
                CR_Pattern_White_Space.Table,
                CR_Pattern_Syntax.Table,
                CR_Unknown.Table,
                CR_Age_1_1.Table,
                CR_Age_2_0.Table,
                CR_Age_2_1.Table,
                CR_Age_3_0.Table,
                CR_Age_3_1.Table,
                CR_Age_3_2.Table,
                CR_Age_4_0.Table,
                CR_Age_4_1.Table,
                CR_Age_5_0.Table,
                CR_Age_5_1.Table,
                CR_Age_5_2.Table,
                CR_Age_6_0.Table
            } : new int[][] {
                CR_NEWLINE.Table,
                CR_Alphabetic.Table,
                CR_Blank.Table,
                CR_Cc.Table,
                CR_Nd.Table,
                CR_Graph.Table,
                CR_Lowercase.Table,
                CR_Print.Table,
                CR_P.Table,
                CR_White_Space.Table,
                CR_Uppercase.Table,
                CR_ASCII_Hex_Digit.Table,
                CR_Word.Table,
                CR_Alnum.Table,
                CR_ASCII.Table
            };

    private static final byte CTypeNameTable[][] = Config.USE_UNICODE_PROPERTIES ?
            new byte[][] {
                "NEWLINE".getBytes(),
                "Alpha".getBytes(),
                "Blank".getBytes(),
                "Cntrl".getBytes(),
                "Digit".getBytes(),
                "Graph".getBytes(),
                "Lower".getBytes(),
                "Print".getBytes(),
                "Punct".getBytes(),
                "Space".getBytes(),
                "Upper".getBytes(),
                "XDigit".getBytes(),
                "Word".getBytes(),
                "Alnum".getBytes(),
                "ASCII".getBytes(),
                "Any".getBytes(),
                "Assigned".getBytes(),
                "C".getBytes(),
                "Cc".getBytes(),
                "Cf".getBytes(),
                "Cn".getBytes(),
                "Co".getBytes(),
                "Cs".getBytes(),
                "L".getBytes(),
                "Ll".getBytes(),
                "Lm".getBytes(),
                "Lo".getBytes(),
                "Lt".getBytes(),
                "Lu".getBytes(),
                "M".getBytes(),
                "Mc".getBytes(),
                "Me".getBytes(),
                "Mn".getBytes(),
                "N".getBytes(),
                "Nd".getBytes(),
                "Nl".getBytes(),
                "No".getBytes(),
                "P".getBytes(),
                "Pc".getBytes(),
                "Pd".getBytes(),
                "Pe".getBytes(),
                "Pf".getBytes(),
                "Pi".getBytes(),
                "Po".getBytes(),
                "Ps".getBytes(),
                "S".getBytes(),
                "Sc".getBytes(),
                "Sk".getBytes(),
                "Sm".getBytes(),
                "So".getBytes(),
                "Z".getBytes(),
                "Zl".getBytes(),
                "Zp".getBytes(),
                "Zs".getBytes(),
                "Math".getBytes(),
                "Alphabetic".getBytes(),
                "Lowercase".getBytes(),
                "Uppercase".getBytes(),
                "Cased".getBytes(),
                "Case_Ignorable".getBytes(),
                "Changes_When_Lowercased".getBytes(),
                "Changes_When_Uppercased".getBytes(),
                "Changes_When_Titlecased".getBytes(),
                "Changes_When_Casefolded".getBytes(),
                "Changes_When_Casemapped".getBytes(),
                "ID_Start".getBytes(),
                "ID_Continue".getBytes(),
                "XID_Start".getBytes(),
                "XID_Continue".getBytes(),
                "Default_Ignorable_Code_Point".getBytes(),
                "Grapheme_Extend".getBytes(),
                "Grapheme_Base".getBytes(),
                "Grapheme_Link".getBytes(),
                "Common".getBytes(),
                "Latin".getBytes(),
                "Greek".getBytes(),
                "Cyrillic".getBytes(),
                "Armenian".getBytes(),
                "Hebrew".getBytes(),
                "Arabic".getBytes(),
                "Syriac".getBytes(),
                "Thaana".getBytes(),
                "Devanagari".getBytes(),
                "Bengali".getBytes(),
                "Gurmukhi".getBytes(),
                "Gujarati".getBytes(),
                "Oriya".getBytes(),
                "Tamil".getBytes(),
                "Telugu".getBytes(),
                "Kannada".getBytes(),
                "Malayalam".getBytes(),
                "Sinhala".getBytes(),
                "Thai".getBytes(),
                "Lao".getBytes(),
                "Tibetan".getBytes(),
                "Myanmar".getBytes(),
                "Georgian".getBytes(),
                "Hangul".getBytes(),
                "Ethiopic".getBytes(),
                "Cherokee".getBytes(),
                "Canadian_Aboriginal".getBytes(),
                "Ogham".getBytes(),
                "Runic".getBytes(),
                "Khmer".getBytes(),
                "Mongolian".getBytes(),
                "Hiragana".getBytes(),
                "Katakana".getBytes(),
                "Bopomofo".getBytes(),
                "Han".getBytes(),
                "Yi".getBytes(),
                "Old_Italic".getBytes(),
                "Gothic".getBytes(),
                "Deseret".getBytes(),
                "Inherited".getBytes(),
                "Tagalog".getBytes(),
                "Hanunoo".getBytes(),
                "Buhid".getBytes(),
                "Tagbanwa".getBytes(),
                "Limbu".getBytes(),
                "Tai_Le".getBytes(),
                "Linear_B".getBytes(),
                "Ugaritic".getBytes(),
                "Shavian".getBytes(),
                "Osmanya".getBytes(),
                "Cypriot".getBytes(),
                "Braille".getBytes(),
                "Buginese".getBytes(),
                "Coptic".getBytes(),
                "New_Tai_Lue".getBytes(),
                "Glagolitic".getBytes(),
                "Tifinagh".getBytes(),
                "Syloti_Nagri".getBytes(),
                "Old_Persian".getBytes(),
                "Kharoshthi".getBytes(),
                "Balinese".getBytes(),
                "Cuneiform".getBytes(),
                "Phoenician".getBytes(),
                "Phags_Pa".getBytes(),
                "Nko".getBytes(),
                "Sundanese".getBytes(),
                "Lepcha".getBytes(),
                "Ol_Chiki".getBytes(),
                "Vai".getBytes(),
                "Saurashtra".getBytes(),
                "Kayah_Li".getBytes(),
                "Rejang".getBytes(),
                "Lycian".getBytes(),
                "Carian".getBytes(),
                "Lydian".getBytes(),
                "Cham".getBytes(),
                "Tai_Tham".getBytes(),
                "Tai_Viet".getBytes(),
                "Avestan".getBytes(),
                "Egyptian_Hieroglyphs".getBytes(),
                "Samaritan".getBytes(),
                "Lisu".getBytes(),
                "Bamum".getBytes(),
                "Javanese".getBytes(),
                "Meetei_Mayek".getBytes(),
                "Imperial_Aramaic".getBytes(),
                "Old_South_Arabian".getBytes(),
                "Inscriptional_Parthian".getBytes(),
                "Inscriptional_Pahlavi".getBytes(),
                "Old_Turkic".getBytes(),
                "Kaithi".getBytes(),
                "Batak".getBytes(),
                "Brahmi".getBytes(),
                "Mandaic".getBytes(),
                "White_Space".getBytes(),
                "Bidi_Control".getBytes(),
                "Join_Control".getBytes(),
                "Dash".getBytes(),
                "Hyphen".getBytes(),
                "Quotation_Mark".getBytes(),
                "Terminal_Punctuation".getBytes(),
                "Other_Math".getBytes(),
                "Hex_Digit".getBytes(),
                "ASCII_Hex_Digit".getBytes(),
                "Other_Alphabetic".getBytes(),
                "Ideographic".getBytes(),
                "Diacritic".getBytes(),
                "Extender".getBytes(),
                "Other_Lowercase".getBytes(),
                "Other_Uppercase".getBytes(),
                "Noncharacter_Code_Point".getBytes(),
                "Other_Grapheme_Extend".getBytes(),
                "IDS_Binary_Operator".getBytes(),
                "IDS_Trinary_Operator".getBytes(),
                "Radical".getBytes(),
                "Unified_Ideograph".getBytes(),
                "Other_Default_Ignorable_Code_Point".getBytes(),
                "Deprecated".getBytes(),
                "Soft_Dotted".getBytes(),
                "Logical_Order_Exception".getBytes(),
                "Other_ID_Start".getBytes(),
                "Other_ID_Continue".getBytes(),
                "STerm".getBytes(),
                "Variation_Selector".getBytes(),
                "Pattern_White_Space".getBytes(),
                "Pattern_Syntax".getBytes(),
                "Unknown".getBytes(),
                "Age_1_1".getBytes(),
                "Age_2_0".getBytes(),
                "Age_2_1".getBytes(),
                "Age_3_0".getBytes(),
                "Age_3_1".getBytes(),
                "Age_3_2".getBytes(),
                "Age_4_0".getBytes(),
                "Age_4_1".getBytes(),
                "Age_5_0".getBytes(),
                "Age_5_1".getBytes(),
                "Age_5_2".getBytes(),
                "Age_6_0".getBytes()
            } : new byte[][] {
                "NEWLINE".getBytes(),
                "Alpha".getBytes(),
                "Blank".getBytes(),
                "Cntrl".getBytes(),
                "Digit".getBytes(),
                "Graph".getBytes(),
                "Lower".getBytes(),
                "Print".getBytes(),
                "Punct".getBytes(),
                "Space".getBytes(),
                "Upper".getBytes(),
                "XDigit".getBytes(),
                "Word".getBytes(),
                "Alnum".getBytes(),
                "ASCII".getBytes()
            };

    private static BytesHash<Integer> initializeCTypeNameTable() {
        BytesHash<Integer> table = new BytesHash<Integer>();
        for (int i=0; i<CTypeNameTable.length; i++) table.putDirect(CTypeNameTable[i], i);

        return table;
    }
    
    static final BytesHash<Integer> CTypeNameHash = initializeCTypeNameTable();
}
