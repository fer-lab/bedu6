package cliTools

class Options(description: String, mode: OptionsKeyTypes = OptionsKeyTypes.NUMBER) {

    private lateinit var mode: OptionsKeyTypes
    private val options: ArrayList<Option> = ArrayList<Option>();
    private val dictionary: HashMap<Int, Char> = createDictionary();

    fun add(label: String)
    {
        options.add(Option(key = nextKey(), label = label))
    }

    fun get(): String
    {
        return "";
    }

    fun nextKey(): String
    {
        val nextItem: Int = (options.size + 1);

        return if (isModeNumber()) {
            nextItem.toString();
        } else {

            if (dictionary.containsKey(nextItem)) {
                dictionary[nextItem].toString();
            } else {
                "??";
            }

        }
    }


    private fun isModeNumber(): Boolean {
        return !isModeLetter();
    }

    private fun isModeLetter(): Boolean {

        return when (mode) {
            OptionsKeyTypes.LETTER -> true
            else -> false;
        }
    }

    private fun createDictionary(): HashMap<Int, Char>
    {
        var value: Char
        var key: Int
        val map = HashMap<Int, Char>();

        value = 'A'
        key = 1;

        while (value <= 'Z') {
            map[key] = value;
            key++;
            ++value
        }

        return map;
    }
}