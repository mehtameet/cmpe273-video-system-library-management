package VideoLibrary;

public class ServiceProxy implements VideoLibrary.Service {
  private String _endpoint = null;
  private VideoLibrary.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new VideoLibrary.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public VideoLibrary.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    service.main(args);
  }
  
  public entity.AccountDetails getAccountDetails(int membershipId) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getAccountDetails(membershipId);
  }
  
  public boolean addUpdateMoviesDetails(int[] columnId, java.lang.String[] movieDetails, int movieId) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.addUpdateMoviesDetails(columnId, movieDetails, movieId);
  }
  
  public entity.MovieCategory[] getMovieCategoryList() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getMovieCategoryList();
  }
  
  public java.lang.String[] getUsersByMovieId(int movieId) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getUsersByMovieId(movieId);
  }
  
  public entity.Movie getMovieDetails(int movieId) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getMovieDetails(movieId);
  }
  
  public entity.Customer[] getUserDetails(java.lang.String userType) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getUserDetails(userType);
  }
  
  public boolean addUpdateUserDetails(int[] columnId, java.lang.String[] userDetails, boolean isNewUser, java.lang.String[] purchaseDetails) throws java.rmi.RemoteException, exception.MalformedException{
    if (service == null)
      _initServiceProxy();
    return service.addUpdateUserDetails(columnId, userDetails, isNewUser, purchaseDetails);
  }
  
  public entity.Customer signIn(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signIn(email, password);
  }
  
  public boolean deleteUser(int[] userId) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteUser(userId);
  }
  
  public boolean issueMovies(int[] columnId, java.lang.String[] movieDetails, int[] movieIds, int amountPaid, java.lang.String transactionDate) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.issueMovies(columnId, movieDetails, movieIds, amountPaid, transactionDate);
  }
  
  public entity.Movie[] searchMovies(int searchBy, java.lang.String searchValue, int lowerLimit, int upperLimit) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.searchMovies(searchBy, searchValue, lowerLimit, upperLimit);
  }
  
  public boolean deleteMovies(int[] movieIds) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteMovies(movieIds);
  }
  
  public boolean returnMovies(int userId, int[] movieIds) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.returnMovies(userId, movieIds);
  }
  
  public entity.Customer[] searchUsers(int searchBy, java.lang.String searchValue, int lowerLimit, int upperLimit, java.lang.String userType) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.searchUsers(searchBy, searchValue, lowerLimit, upperLimit, userType);
  }
  
  
}