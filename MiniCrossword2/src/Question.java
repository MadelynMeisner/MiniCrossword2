class Question
{
 
		private String question;
		private String answer;
		private String number;


	public Question(String n,String q, String a)
	{    
	number = n;
	question = q;
	answer = a;
	
	}
	
	public String getNumber()
	{
	return number;
	}
	
	public void setNumber(String n)
	{
	number = n;
	}
	
	public String getQuestion()
	    {
	      return question;
	    }

	public void setQuestion(String q)
	    {
	      question = q;
	    }

	  public String getAnswer()
	      {
	        return answer;
	      }

	  public void setAnswer(String a)
	      {
	       answer = a;
	      }