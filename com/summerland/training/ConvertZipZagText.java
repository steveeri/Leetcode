package com.summerland.training;


public class ConvertZipZagText {

	public Solution sol = new Solution();

	public class Solution {

		public String convert(String s, int numRows) {

			int strLen = s.length();

			if (numRows == 1 || strLen == 1) return s;

			String[] zigs = new String[numRows];

			// Easier to just initalise rows to empty string.
			for (int i = 0; i < numRows; i++) zigs[i] = "";
			
			int offset = 1;
			int rowIdx = 0;

			for (int i = 0; i < strLen; i++) {
				zigs[rowIdx] = zigs[rowIdx] + s.charAt(i);
				
				// Decide if we are zigging or zagging clamp 
				if (offset > 0 && rowIdx+1 >= numRows)
					offset = -1;
				else if (offset < 0 && rowIdx-1 < 0)
					offset = 1;

				rowIdx += offset;
			}

			// Reconstitute string following zigging.
			var sb = new StringBuilder();
			for (String str: zigs) 
				sb.append(str);

			return sb.toString();
		}
	}

}
