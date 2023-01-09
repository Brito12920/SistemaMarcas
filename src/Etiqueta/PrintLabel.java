/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Etiqueta;

/**
 *
 * @author Valdenir Brito
 */
public class PrintLabel {
    
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public String printLabel(String descricao, String sap, String data, String tipo){
      System.out.println();
        label = "^XA\n"
                + "~TA000\n"
                + "~JSN\n"
                + "^LT0\n"
                + "^MNW\n"
                + "^MTT\n"
                + "^PON\n"
                + "^PMN\n"
                + "^LH0,0\n"
                + "^JMA\n"
                + "^PR4,4\n"
                + "~SD15\n"
                + "^JUS\n"
                + "^LRN\n"
                + "^CI27\n"
                + "^PA0,1,1,0\n"
                + "^XZ\n"
                + "^XA\n"
                + "^MMT\n"
                + "^PW831\n"
                + "^LL406\n"
                + "^LS0\n"
                
                + "^FT50,209^A0N,41,41^FH\\^CI28^FD"+descricao+"^FS^CI27\n"
                + "^BY3,3,77^FT250,107^B3N,N,,Y,N\n"
                + "^FH\\^FD"+sap+"\\0D\\0A^FS\n"
                
               
                + "^FT672,200^A0N,28,28^FH\\^CI28^FD"+data+"^FS^CI27\n"
                + "^FO50,20^GFA,661,2496,24,:Z64:eJzFlrFOwzAQhuNayAODJ8QYZhZWtrwCS+e+AgsbkjvDS/Q9GJpHYGEmY8XUMUIlxs7Z7p3PRqpAwkOlfv1j/7/PObdp/nJcPBSxtnZaF/jKWttzLB22I+fK8wPnW88tX2DGfAEJnC2ggLMFOuBsAWPLCwRsB4pF5PuiHWZIRZ4Z0pFPlLeR27L9PMBs/50H8ORjwQOYeeZLxsH5eR5AhKR5YB93A7bGnIcYJLAOQXUWWAWd4voxzEf0bfAhsg1qY55sg9q4L4bquyjrqD59bSs806dpW1oAE21rutGJK6q3Vf2hog9cVvQZT2X6NQ/HQNAD8X/68SS9QfriPGz+0/azXq/T6ovPD+W2yG3l3OLziXntPP/wvgw0SNLXePH9je+1qPcH0k/Uke8zPvvuCn2pB/t9zndNs8j7pIDOrFi/hU7bIX41f/r++SoMsn+f9LT/T0lP7hcBE6Z+vgG8llCH1P/flss7p+4VPJnuC1hC7rTPg+6XEGSvYEMk4s6JnmRwZtAPzsYkQhKE7e7JhQ+XfYv418rlMBAAG/Jj6CCAzHjULxD7fJ7nb3JDvfsS/TQ3R+4Kkfw3Ij3g8x5kOgBbtD/no07v2VnkTigGdTwA1y8wfAkGWfjrgerFx1ThjxV+W+F+fAMEgvLw:DDEE\n"
                + "^FT50,156^A0N,28,28^FH\\^CI28^FD"+tipo+"^FS^CI27\n"
                
                + "^PQ1,0,1,Y\n"
                + "^XZ";

        System.out.println(label);
        return label;
    }
    
}
