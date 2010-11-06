package info.sudr.hfdp.lowercase

scenario "lower case given input", {
	given "a input stream decorated with lower caser", {
		is = new LowerCaseDecorator(new FileInputStream("build/classes/test/info/sudr/hfdp/lowercase/input.txt"))
	}
	
	then "the text is all in lower case", {
		while ((c = is.read()) >= 0) {
			print ((char)c)
		}
	}
}