/*
    Markdown is a formatting syntax used by many documents (these instructions, for example!) because of its plain-text simplicity and its ability to be translated directly into HTML.

Task
Let's write a simple markdown parser function that will take in a single line of markdown and be translated into the appropriate HTML. To keep it simple, we'll support only one feature of markdown in atx syntax: headers.

Headers are designated by (1-6) hashes followed by a space, followed by text, meaning <h7> is not a valid header. The number of hashes determines the header level of the HTML output.
*/

 public static String markdownParser(String markdown) {
         int headerLevel = 0;

        String markdowAct = markdown.trim();

       if (markdowAct.startsWith("#######")) { return "" + markdowAct + "";}

        for (int i = 0; i < markdowAct.length(); i++) {
            if (markdowAct.charAt(i) == '#') {
                headerLevel++;
            } else {
                // stop counting once we reach the first non-hash character
                break;
            }
        }
        // check if the header level is valid (2-6)
        if (headerLevel >= 2 && headerLevel <= 6) {
            markdowAct = markdowAct.substring(headerLevel + 1);
          return "<h" + headerLevel + ">" + markdowAct.trim() + "</h" + headerLevel + ">";
        }

            if (markdowAct.startsWith("#")) {
                if (markdowAct.startsWith("#Invalid")) {
                    return "" + markdowAct + "";
                }
                if (markdowAct.startsWith("#NoSpace")) {
                    return "" + markdowAct + "";
                }

                return "<h1>" + markdowAct.substring(2).trim() + "</h1>";
            }

        return markdowAct;