@regression @smoke @CA-3 @E2E
Feature: Ebay Brand Outline2

Description: User should able to filter items by Brand

Background:
      Given Open Ebay Homepage
      
      Scenario Outline: Filter items by Brand2
      Given Search for "<Items>"
      When Filter by "<Brand>"
      Then Item list should have products of "<Brand>"

   Examples:
       	|Items		    |Brand		|
		|Sunglasses		|Gucci		|
		|Watches		|Rolex		|
		|Perfumes		|Chanel	    |













