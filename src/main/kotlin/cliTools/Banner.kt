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
        boxTop()
        boxLeft(content.length);

        // todo margins
        print(content);
        boxRight(content.length);
        boxBottom()
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