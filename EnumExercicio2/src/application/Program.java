package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(sdf.parse("20/12/2023 18:10:22"), 
				"Travelig to the New Zeland",
				"I'm goind to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the Force be with you");
	Post p2 = new Post (sdf.parse("18/12/2023 17:10:22"), "Good night guys", "See you tomorrow", 10);

		p2.addComment(c3);
		p2.addComment(c3);
		
		System.out.println(p2);
		
	}

}
