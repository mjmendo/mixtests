package mysandbox.mixtests.emboyere;

enum ProgramFlags {
    showErrors(0x02),
    includeFileOutput(0x02),
    useAlternateProcessor(0x04);

    private int bit;

    ProgramFlags(int bitNumber)
    {
        bit = bitNumber;
    }

    public int getBitNumber()
    {
        return(bit);
    }

}

public class EnumBitmapExample {
    public static void main(String args[])
    {
        ProgramFlags flag = ProgramFlags.showErrors;

        System.out.println("Flag selected is: " +
                                flag.ordinal() +
                           " which is " +
                                flag.name());
    }
}
