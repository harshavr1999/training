/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.iterator;

/**
 *
 * @author harshavardhan.reddy
 */
public class IteratorPatternTest {
    
    private static ChannelCollection populateChannels(){
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.KANNADA));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.TELUGU));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.KANNADA));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.TELUGU));
        
        return channels;
    }
    
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while(baseIterator.hasNext()){
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("*******");
        
        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while(englishIterator.hasNext()){
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("*******");
        
        ChannelIterator teluguIterator = channels.iterator(ChannelTypeEnum.TELUGU);
        while(teluguIterator.hasNext()){
            Channel c = teluguIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("*******");
        
        ChannelIterator kannadaIterator = channels.iterator(ChannelTypeEnum.KANNADA);
        while(kannadaIterator.hasNext()){
            Channel c = kannadaIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("*******");
        
        ChannelIterator hindiIterator = channels.iterator(ChannelTypeEnum.HINDI);
        while(hindiIterator.hasNext()){
            Channel c = hindiIterator.next();
            System.out.println(c.toString());
        }
        
    }
    
}
