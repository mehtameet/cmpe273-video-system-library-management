package VideoLibrary;

import entity.AccountDetails;
import entity.Customer;
import entity.Movie;
import entity.MovieCategory;
import exception.MalformedException;

public interface ServiceInterface {
	
	public Customer signIn(String email, String password);

	public boolean addUpdateUserDetails(int[] columnId, String[] userDetails, boolean isNewUser, String[] purchaseDetails)  throws MalformedException;

	public Customer[] searchUsers(int searchBy, String searchValue,int lowerLimit, int upperLimit, String userType);

	public boolean deleteUser(int[] userId);

	public boolean issueMovies(int[] columnId, String[] movieDetails,
			int[] movieIds, int amountPaid, String transactionDate);

	public Movie[] searchMovies(int searchBy, String searchValue, int lowerLimit, int upperLimit);

	public boolean deleteMovies(int[] movieIds);

	/*public boolean issueMovies(int userId, int[] movieIds);*/

	public boolean returnMovies(int userId, int[] movieIds);

	public Customer[] getUserDetails(String userType);

	public Movie getMovieDetails(int movieId);

	public String[] getUsersByMovieId(int movieId);
	
	public MovieCategory[] getMovieCategoryList();
	
	public boolean addUpdateMoviesDetails(int[] columnId, String[] movieDetails,
            int movieId);
	
	public AccountDetails getAccountDetails(int memberShipId);
}
