/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState
) {
      //username: user
      //sRk63s0yy1R8
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

/*
  // save 2 information at 1 time, need 2 ParseObject
    // save a piece of information

    ParseObject score = new ParseObject("Score");
    score.put("username","lenore1111");
    score.put("score",999);
    // score.save(); will pause this app until the save happens
    //SaveCallback will tell us about when it happens,
    //  then we can know whether or not things were successful
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){
          // successful
          Log.i("Success","we saved the score22222");

        }else {
          e.printStackTrace();
        }
      }
    });

    // save a piece of information

    ParseObject score2 = new ParseObject("Score");
    score2.put("username","lenore");
    score2.put("score",777);
    // score.save(); will pause this app until the save happens
    //SaveCallback will tell us about when it happens,
    //  then we can know whether or not things were successful
    score2.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){
          // successful
          Log.i("Success","we saved the score22222");

        }else {
          e.printStackTrace();
        }
      }
    });

*/

/*
    // get a piece of information
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.getInBackground("GM9Vh3AwWe", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject parseObject, ParseException e) {
        if(e == null && parseObject!= null){

          // if we want to update this object
          //parseObject.put("score", 80);
          //parseObject.saveInBackground();

          // then here will log 80. the save doesn't happen super fast,
          //    it's because this object is now locally here inside of this function.
          String username = parseObject.getString("username");
          Log.i("username",username);
          String score = Integer.toString(parseObject.getInt("score"));
          Log.i("score",score);
        }else{
          e.printStackTrace();

        }
      }
    });

*/
/*
    // another example
    // Create a tweet class, username tweet, save it to parse, query it, update the tweet
    ParseObject tweet = new ParseObject("Tweet");

    tweet.put("tweet","sky");
      tweet.put("username","lenoreAgain");

    tweet.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e==null){
          Log.i("saveTweet","Successful");
        }else{
          e.printStackTrace();
        }
      }
    });
*/
/*
    ParseQuery<ParseObject> tweetQuery = ParseQuery.getQuery("Tweet");
    tweetQuery.getInBackground("OTaTpys3pU", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject parseObject, ParseException e) {
        if(e==null && parseObject!= null){
          // if we want to update this object
          parseObject.put("username", "ocean");
          parseObject.saveInBackground();

          Log.i("username!!!",parseObject.getString("username"));

        }else{
          e.printStackTrace();
          Log.i("elseeeeeeee!!!",parseObject.getString("username"));
        }
      }
    });


    //get everything
    ParseQuery<ParseObject> scoreQuery = ParseQuery.getQuery("Score");

    scoreQuery.whereEqualTo("username","lenore1111");
    scoreQuery.setLimit(1);

    scoreQuery.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> list, ParseException e) {
        if(e==null && list.size()>0){
          for(ParseObject object: list){
            Log.i("username",object.getString("username"));
            Log.i("score", Integer.toString(object.getInt("score")));

          }
        }
      }
    });
*/

/*
    // get object whose score is higher than 777 and add 1 to their score
    ParseQuery<ParseObject> highScore = ParseQuery.getQuery("Score");
    highScore.whereGreaterThan("score",777);

    highScore.findInBackground(new FindCallback<ParseObject>() {
        @Override
        public void done(List<ParseObject> list, ParseException e) {
            if(e==null &&  list.size()>0){
                for(ParseObject object : list){
                    int mark = object.getInt("score");
                    object.put("score", mark +1);
                    object.saveInBackground(new SaveCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e==null){
                                Log.i("change saved","successful");
                            }else{
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }else{
                e.printStackTrace();
            }
        }
    });

*/

/*
    // a user sign up with username and password
    ParseUser user = new ParseUser();

    user.setUsername("lenore");
    user.setPassword("lenoreAgain");

    user.signUpInBackground(new SignUpCallback() {
        @Override
        public void done(ParseException e) {
            if(e==null){
                Log.i("sign up","successful");
            }else{
                e.printStackTrace();
            }
        }
    });


      // a user sign up with username and password
      ParseUser user2 = new ParseUser();

      user2.setUsername("lenore2");
      user2.setPassword("lenoreAgain2");

      user2.signUpInBackground(new SignUpCallback() {
          @Override
          public void done(ParseException e) {
              if(e==null){
                  Log.i("sign up","successful");
              }else{
                  e.printStackTrace();
              }
          }
      });
*/
/*
    // a user is trying to log in
      ParseUser.logInInBackground("lenore", "lenoreAgain", new LogInCallback() {
          @Override
          public void done(ParseUser parseUser, ParseException e) {
              if(e==null && parseUser!=null){
                  Log.i("a user signed in",parseUser.getUsername());
              }else{
                  e.printStackTrace();
              }
          }
      });
*/
/*
      // current user are going to log out
      ParseUser.logOut();
      // logOut() is a static method, which belongs to the ParseUser class,
      // so it can be directly called on the class itself
      // ParseUser object doesn't need to be instantiated in order to call logOut().

      // check if a user has already log in
      if(ParseUser.getCurrentUser() != null){
          Log.i("current user",ParseUser.getCurrentUser().getUsername());
      }else{
          Log.i("no current user","");
      }
*/


    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}