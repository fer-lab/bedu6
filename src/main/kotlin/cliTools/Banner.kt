package cliTools

class Banner {

    private var currentLine: String = "";
    private val maxWidth = 60;

    fun display(title: String, body: String = "")
    {
        displayTitle(title);

        if (body == "")
        {
            displayBody(body);
        }
    }

    private fun displayTitle(content: String)
    {
        var contentFixed = content.trim();
        boxTop()
        boxLeft(content.length);

        // todo margins

        if (content.length >= maxWidth + 2)
        {
            contentFixed = wordWrap(content);
        }


        print(contentFixed);
        boxRight(contentFixed.length);
        boxBottom()
    }

    private fun wordWrap(text: String): String
    {
        return text;
    }

    private fun displayBody(content: String)
    {

    }

    private fun boxTop()
    {
        println("-".repeat(maxWidth));
    }

    private fun boxLeft(length: Int)
    {
        print("| ");
    }

    private fun boxRight(length: Int)
    {
        val limit = maxWidth - 4;

        println("xxxxxxxxle ${length}, li ${limit}")

        if (length < limit)
        {
            println("aaaa")
            print(" ".repeat(limit - length))
        }

        print(" |\n")
    }

    private fun boxBottom()
    {
        println("-".repeat(maxWidth));

    }
    companion object
    {

        private fun instance(): Banner
        {
            return Banner();
        }

        fun simple(title: String)
        {
            instance().display(title = title);
        }

        fun withBody(title: String, body: String)
        {
            instance().display(title = title, body);
        }
    }
}