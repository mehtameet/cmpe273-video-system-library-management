/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package VideoLibrary;

public interface Service extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public boolean deleteUser(int[] userId) throws java.rmi.RemoteException;
    public boolean issueMovies(int[] columnId, java.lang.String[] movieDetails, int[] movieIds, int amountPaid, java.lang.String transactionDate) throws java.rmi.RemoteException;
    public entity.Movie[] searchMovies(int searchBy, java.lang.String searchValue, int lowerLimit, int upperLimit) throws java.rmi.RemoteException;
    public boolean deleteMovies(int[] movieIds) throws java.rmi.RemoteException;
    public boolean returnMovies(int userId, int[] movieIds) throws java.rmi.RemoteException;
    public entity.Customer signIn(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public entity.Customer[] searchUsers(int searchBy, java.lang.String searchValue, int lowerLimit, int upperLimit, java.lang.String userType) throws java.rmi.RemoteException;
    public java.lang.String[] getUsersByMovieId(int movieId) throws java.rmi.RemoteException;
    public entity.MovieCategory[] getMovieCategoryList() throws java.rmi.RemoteException;
    public entity.Movie getMovieDetails(int movieId) throws java.rmi.RemoteException;
    public entity.Customer[] getUserDetails(java.lang.String userType) throws java.rmi.RemoteException;
    public boolean addUpdateUserDetails(int[] columnId, java.lang.String[] userDetails, boolean isNewUser, java.lang.String[] purchaseDetails) throws java.rmi.RemoteException, exception.MalformedException;
    public boolean addUpdateMoviesDetails(int[] columnId, java.lang.String[] movieDetails, int movieId) throws java.rmi.RemoteException;
    public entity.AccountDetails getAccountDetails(int membershipId) throws java.rmi.RemoteException;
}
