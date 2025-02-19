package PatternsBahavioral.LearningIterator.social_networks;

import PatternsBahavioral.LearningIterator.interators.ProfileIterator;

//Define interface comum de rede social
public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
