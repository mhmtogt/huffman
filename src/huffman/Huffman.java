/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huffman;

import static huffman.HuffmanDecoding.huffmanDecoding;
import static huffman.HuffmanEncoding.characterMapping;
import static huffman.HuffmanEncoding.huffmanEncoding;
import static huffman.HuffmanEncoding.writeCharacterMappingTable;
import java.io.IOException;

/**
 *
 * @author mehmet
 */
public class Huffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
            
        String input = "kodlanacakDosya.txt";
        String output = "kodlanmisDosya.txt";
        String characterMappingOutput = "karakterHaritasi.txt";

        int[] characterFrequency = Others.frequencyTable(input);

        String[] characterMappingTable = characterMapping(characterFrequency);
        writeCharacterMappingTable(characterMappingTable, characterFrequency, characterMappingOutput);
        

        String encryptedText = huffmanEncoding(characterMappingTable, input, output, characterMappingTable, characterFrequency);
        
        
        String cipher = "kodlanmisDosya.txt";
        String decyptedText = huffmanDecoding(cipher, characterMappingTable, characterFrequency);
        System.out.println("Şifrelenecek Dosya içeriği");
        
        System.out.println(decyptedText);
        
        System.out.println("\nŞifrelenmiş Dosya İçeriği");
        System.out.println(encryptedText);
        

    }
    
}
