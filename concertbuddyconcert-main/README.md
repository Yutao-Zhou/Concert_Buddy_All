# concertbuddyconcert

Concert microservice for the ConcertBuddy project

Ticket master example response:
```
{
    "_embedded": {
        "events": [
            {
                "name": "Utah Jazz vs. Phoenix Suns",
                "type": "event",
                "id": "Z7r9jZ1AdJ4aP",
                "test": false,
                "url": "https://www.ticketmaster.com/event/Z7r9jZ1AdJ4aP",
                "locale": "en-us",
                "images": [
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_3_2.jpg",
                        "width": 640,
                        "height": 427,
                        "fallback": false
                    },
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_ARTIST_PAGE_3_2.jpg",
                        "width": 305,
                        "height": 203,
                        "fallback": false
                    },
                    {
                        "ratio": "4_3",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_CUSTOM.jpg",
                        "width": 305,
                        "height": 225,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_16_9.jpg",
                        "width": 640,
                        "height": 360,
                        "fallback": false
                    },
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_3_2.jpg",
                        "width": 1024,
                        "height": 683,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RECOMENDATION_16_9.jpg",
                        "width": 100,
                        "height": 56,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                        "width": 2048,
                        "height": 1152,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_LANDSCAPE_16_9.jpg",
                        "width": 1136,
                        "height": 639,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_16_9.jpg",
                        "width": 1024,
                        "height": 576,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_EVENT_DETAIL_PAGE_16_9.jpg",
                        "width": 205,
                        "height": 115,
                        "fallback": false
                    }
                ],
                "sales": {
                    "public": {
                        "startDateTime": "1900-01-01T18:00:00Z",
                        "startTBD": false,
                        "startTBA": false,
                        "endDateTime": "2023-11-18T03:00:00Z"
                    }
                },
                "dates": {
                    "start": {
                        "localDate": "2023-11-17",
                        "localTime": "20:00:00",
                        "dateTime": "2023-11-18T03:00:00Z",
                        "dateTBD": false,
                        "dateTBA": false,
                        "timeTBA": false,
                        "noSpecificTime": false
                    },
                    "status": {
                        "code": "onsale"
                    },
                    "spanMultipleDays": false
                },
                "classifications": [
                    {
                        "primary": true,
                        "segment": {
                            "id": "KZFzniwnSyZfZ7v7nE",
                            "name": "Sports"
                        },
                        "genre": {
                            "id": "KnvZfZ7vAde",
                            "name": "Basketball"
                        },
                        "subGenre": {
                            "id": "KZazBEonSMnZfZ7vFJA",
                            "name": "NBA"
                        },
                        "family": false
                    }
                ],
                "outlets": [
                    {
                        "url": "https://www.ticketmaster.com/utah-jazz-vs-phoenix-suns-salt-lake-city-utah-11-17-2023/event/Zu0FM1R0e5tfAJQ",
                        "type": "tmMarketPlace"
                    }
                ],
                "seatmap": {
                    "staticUrl": "https://content.resale.ticketmaster.com/graphics/TMResale/2/VenueMaps/459-902-3-0-VivintSmartHomeArenaUtahJazz.png"
                },
                "ticketing": {
                    "allInclusivePricing": {
                        "enabled": false
                    }
                },
                "_links": {
                    "self": {
                        "href": "/discovery/v2/events/Z7r9jZ1AdJ4aP?locale=en-us"
                    },
                    "attractions": [
                        {
                            "href": "/discovery/v2/attractions/K8vZ9171o5V?locale=en-us"
                        },
                        {
                            "href": "/discovery/v2/attractions/K8vZ9171oZf?locale=en-us"
                        },
                        {
                            "href": "/discovery/v2/attractions/K8vZ917hik0?locale=en-us"
                        }
                    ],
                    "venues": [
                        {
                            "href": "/discovery/v2/venues/Z6r9jZAk1e?locale=en-us"
                        }
                    ]
                },
                "_embedded": {
                    "venues": [
                        {
                            "name": "Delta Center",
                            "type": "venue",
                            "id": "Z6r9jZAk1e",
                            "test": false,
                            "locale": "en-us",
                            "postalCode": "84101",
                            "timezone": "America/Denver",
                            "city": {
                                "name": "Salt Lake City"
                            },
                            "state": {
                                "name": "Utah",
                                "stateCode": "UT"
                            },
                            "country": {
                                "name": "United States Of America",
                                "countryCode": "US"
                            },
                            "address": {
                                "line1": "301 W. South Temple"
                            },
                            "location": {
                                "longitude": "-111.8992",
                                "latitude": "40.756599"
                            },
                            "dmas": [
                                {
                                    "id": 378
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 64,
                                "ticketmaster": 20,
                                "_total": 84,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/venues/Z6r9jZAk1e?locale=en-us"
                                }
                            }
                        }
                    ],
                    "attractions": [
                        {
                            "name": "Utah Jazz",
                            "type": "attraction",
                            "id": "K8vZ9171o5V",
                            "test": false,
                            "url": "https://www.ticketmaster.com/utah-jazz-tickets/artist/806035",
                            "locale": "en-us",
                            "externalLinks": {
                                "twitter": [
                                    {
                                        "url": "https://twitter.com/utahjazz"
                                    }
                                ],
                                "wiki": [
                                    {
                                        "url": "https://en.wikipedia.org/wiki/Utah_Jazz"
                                    }
                                ],
                                "facebook": [
                                    {
                                        "url": "https://www.facebook.com/utahjazz"
                                    }
                                ],
                                "instagram": [
                                    {
                                        "url": "https://www.instagram.com/utahjazz/"
                                    }
                                ],
                                "homepage": [
                                    {
                                        "url": "https://www.nba.com/jazz/"
                                    }
                                ]
                            },
                            "images": [
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_3_2.jpg",
                                    "width": 640,
                                    "height": 427,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_ARTIST_PAGE_3_2.jpg",
                                    "width": 305,
                                    "height": 203,
                                    "fallback": false
                                },
                                {
                                    "ratio": "4_3",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_CUSTOM.jpg",
                                    "width": 305,
                                    "height": 225,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_16_9.jpg",
                                    "width": 640,
                                    "height": 360,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_3_2.jpg",
                                    "width": 1024,
                                    "height": 683,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RECOMENDATION_16_9.jpg",
                                    "width": 100,
                                    "height": 56,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                                    "width": 2048,
                                    "height": 1152,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_LANDSCAPE_16_9.jpg",
                                    "width": 1136,
                                    "height": 639,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_16_9.jpg",
                                    "width": 1024,
                                    "height": 576,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_EVENT_DETAIL_PAGE_16_9.jpg",
                                    "width": 205,
                                    "height": 115,
                                    "fallback": false
                                }
                            ],
                            "classifications": [
                                {
                                    "primary": true,
                                    "segment": {
                                        "id": "KZFzniwnSyZfZ7v7nE",
                                        "name": "Sports"
                                    },
                                    "genre": {
                                        "id": "KnvZfZ7vAde",
                                        "name": "Basketball"
                                    },
                                    "subGenre": {
                                        "id": "KZazBEonSMnZfZ7vFJA",
                                        "name": "NBA"
                                    },
                                    "type": {
                                        "id": "KZAyXgnZfZ7v7l1",
                                        "name": "Group"
                                    },
                                    "subType": {
                                        "id": "KZFzBErXgnZfZ7vA7d",
                                        "name": "Team"
                                    },
                                    "family": false
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 43,
                                "ticketmaster": 26,
                                "_total": 69,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/attractions/K8vZ9171o5V?locale=en-us"
                                }
                            }
                        },
                        {
                            "name": "Phoenix Suns",
                            "type": "attraction",
                            "id": "K8vZ9171oZf",
                            "test": false,
                            "url": "https://www.ticketmaster.com/phoenix-suns-tickets/artist/806004",
                            "locale": "en-us",
                            "externalLinks": {
                                "twitter": [
                                    {
                                        "url": "https://twitter.com/Suns"
                                    }
                                ],
                                "wiki": [
                                    {
                                        "url": "https://en.wikipedia.org/wiki/Phoenix_Suns"
                                    }
                                ],
                                "facebook": [
                                    {
                                        "url": "https://www.facebook.com/suns/"
                                    }
                                ],
                                "instagram": [
                                    {
                                        "url": "https://www.instagram.com/suns/"
                                    }
                                ],
                                "homepage": [
                                    {
                                        "url": "https://www.nba.com/suns/"
                                    }
                                ]
                            },
                            "aliases": [
                                "phoenix",
                                "suns",
                                "phoenix suns exchange",
                                "phoenix suns team exchange",
                                "phoenix suns season ticket holders",
                                "phoenix suns season tix holders",
                                "phoenix suns ticket exchange",
                                "suns exchange",
                                "suns season ticket holders",
                                "suns season tix holders",
                                "suns team exchange",
                                "suns ticket exchange"
                            ],
                            "images": [
                                {
                                    "ratio": "4_3",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_CUSTOM.jpg",
                                    "width": 305,
                                    "height": 225,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_PORTRAIT_16_9.jpg",
                                    "width": 640,
                                    "height": 360,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                                    "width": 2048,
                                    "height": 1152,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_EVENT_DETAIL_PAGE_16_9.jpg",
                                    "width": 205,
                                    "height": 115,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_ARTIST_PAGE_3_2.jpg",
                                    "width": 305,
                                    "height": 203,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_16_9.jpg",
                                    "width": 1024,
                                    "height": 576,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_PORTRAIT_3_2.jpg",
                                    "width": 640,
                                    "height": 427,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_3_2.jpg",
                                    "width": 1024,
                                    "height": 683,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_LANDSCAPE_16_9.jpg",
                                    "width": 1136,
                                    "height": 639,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RECOMENDATION_16_9.jpg",
                                    "width": 100,
                                    "height": 56,
                                    "fallback": false
                                }
                            ],
                            "classifications": [
                                {
                                    "primary": true,
                                    "segment": {
                                        "id": "KZFzniwnSyZfZ7v7nE",
                                        "name": "Sports"
                                    },
                                    "genre": {
                                        "id": "KnvZfZ7vAde",
                                        "name": "Basketball"
                                    },
                                    "subGenre": {
                                        "id": "KZazBEonSMnZfZ7vFJA",
                                        "name": "NBA"
                                    },
                                    "type": {
                                        "id": "KZAyXgnZfZ7v7l1",
                                        "name": "Group"
                                    },
                                    "subType": {
                                        "id": "KZFzBErXgnZfZ7vA7d",
                                        "name": "Team"
                                    },
                                    "family": false
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 10,
                                "ticketmaster": 61,
                                "_total": 71,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/attractions/K8vZ9171oZf?locale=en-us"
                                }
                            }
                        },
                        {
                            "name": "NBA In-Season Tournament",
                            "type": "attraction",
                            "id": "K8vZ917hik0",
                            "test": false,
                            "url": "https://www.ticketmaster.com/nba-inseason-tournament-tickets/artist/3050896",
                            "locale": "en-us",
                            "images": [
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_RETINA_PORTRAIT_16_9.jpg",
                                    "width": 640,
                                    "height": 360,
                                    "fallback": true
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_EVENT_DETAIL_PAGE_16_9.jpg",
                                    "width": 205,
                                    "height": 115,
                                    "fallback": true
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_TABLET_LANDSCAPE_16_9.jpg",
                                    "width": 1024,
                                    "height": 576,
                                    "fallback": true
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_RETINA_LANDSCAPE_16_9.jpg",
                                    "width": 1136,
                                    "height": 639,
                                    "fallback": true
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_ARTIST_PAGE_3_2.jpg",
                                    "width": 305,
                                    "height": 203,
                                    "fallback": true
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_RECOMENDATION_16_9.jpg",
                                    "width": 100,
                                    "height": 56,
                                    "fallback": true
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_RETINA_PORTRAIT_3_2.jpg",
                                    "width": 640,
                                    "height": 427,
                                    "fallback": true
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_TABLET_LANDSCAPE_3_2.jpg",
                                    "width": 1024,
                                    "height": 683,
                                    "fallback": true
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                                    "width": 2048,
                                    "height": 1152,
                                    "fallback": true
                                },
                                {
                                    "ratio": "4_3",
                                    "url": "https://s1.ticketm.net/dam/c/8d5/f95bdd17-1d94-4e98-9295-641e4db558d5_105621_CUSTOM.jpg",
                                    "width": 305,
                                    "height": 225,
                                    "fallback": true
                                }
                            ],
                            "classifications": [
                                {
                                    "primary": true,
                                    "segment": {
                                        "id": "KZFzniwnSyZfZ7v7nE",
                                        "name": "Sports"
                                    },
                                    "genre": {
                                        "id": "KnvZfZ7vAde",
                                        "name": "Basketball"
                                    },
                                    "subGenre": {
                                        "id": "KZazBEonSMnZfZ7vFJA",
                                        "name": "NBA"
                                    },
                                    "type": {
                                        "id": "KZAyXgnZfZ7v7lt",
                                        "name": "Event Style"
                                    },
                                    "subType": {
                                        "id": "KZFzBErXgnZfZ7vAkJ",
                                        "name": "Competition"
                                    },
                                    "family": false
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 12,
                                "ticketmaster": 29,
                                "_total": 41,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/attractions/K8vZ917hik0?locale=en-us"
                                }
                            }
                        }
                    ]
                }
            },
            {
                "name": "Utah Jazz vs. Phoenix Suns",
                "type": "event",
                "id": "Z7r9jZ1AdJ9uz",
                "test": false,
                "url": "https://www.ticketmaster.com/event/Z7r9jZ1AdJ9uz",
                "locale": "en-us",
                "images": [
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_3_2.jpg",
                        "width": 640,
                        "height": 427,
                        "fallback": false
                    },
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_ARTIST_PAGE_3_2.jpg",
                        "width": 305,
                        "height": 203,
                        "fallback": false
                    },
                    {
                        "ratio": "4_3",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_CUSTOM.jpg",
                        "width": 305,
                        "height": 225,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_16_9.jpg",
                        "width": 640,
                        "height": 360,
                        "fallback": false
                    },
                    {
                        "ratio": "3_2",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_3_2.jpg",
                        "width": 1024,
                        "height": 683,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RECOMENDATION_16_9.jpg",
                        "width": 100,
                        "height": 56,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                        "width": 2048,
                        "height": 1152,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_LANDSCAPE_16_9.jpg",
                        "width": 1136,
                        "height": 639,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_16_9.jpg",
                        "width": 1024,
                        "height": 576,
                        "fallback": false
                    },
                    {
                        "ratio": "16_9",
                        "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_EVENT_DETAIL_PAGE_16_9.jpg",
                        "width": 205,
                        "height": 115,
                        "fallback": false
                    }
                ],
                "sales": {
                    "public": {
                        "startDateTime": "2023-08-17T19:00:00Z",
                        "startTBD": false,
                        "startTBA": false,
                        "endDateTime": "2023-11-20T01:00:00Z"
                    }
                },
                "dates": {
                    "start": {
                        "localDate": "2023-11-19",
                        "localTime": "18:00:00",
                        "dateTime": "2023-11-20T01:00:00Z",
                        "dateTBD": false,
                        "dateTBA": false,
                        "timeTBA": false,
                        "noSpecificTime": false
                    },
                    "status": {
                        "code": "onsale"
                    },
                    "spanMultipleDays": false
                },
                "classifications": [
                    {
                        "primary": true,
                        "segment": {
                            "id": "KZFzniwnSyZfZ7v7nE",
                            "name": "Sports"
                        },
                        "genre": {
                            "id": "KnvZfZ7vAde",
                            "name": "Basketball"
                        },
                        "subGenre": {
                            "id": "KZazBEonSMnZfZ7vFJA",
                            "name": "NBA"
                        },
                        "family": false
                    }
                ],
                "outlets": [
                    {
                        "url": "https://www.ticketmaster.com/utah-jazz-vs-phoenix-suns-salt-lake-city-utah-11-19-2023/event/Zu0FM1R0e5tf1BT",
                        "type": "tmMarketPlace"
                    }
                ],
                "seatmap": {
                    "staticUrl": "https://content.resale.ticketmaster.com/graphics/TMResale/2/VenueMaps/459-902-3-0-VivintSmartHomeArenaUtahJazz.png"
                },
                "ticketing": {
                    "allInclusivePricing": {
                        "enabled": false
                    }
                },
                "_links": {
                    "self": {
                        "href": "/discovery/v2/events/Z7r9jZ1AdJ9uz?locale=en-us"
                    },
                    "attractions": [
                        {
                            "href": "/discovery/v2/attractions/K8vZ9171o5V?locale=en-us"
                        },
                        {
                            "href": "/discovery/v2/attractions/K8vZ9171oZf?locale=en-us"
                        }
                    ],
                    "venues": [
                        {
                            "href": "/discovery/v2/venues/Z6r9jZAk1e?locale=en-us"
                        }
                    ]
                },
                "_embedded": {
                    "venues": [
                        {
                            "name": "Delta Center",
                            "type": "venue",
                            "id": "Z6r9jZAk1e",
                            "test": false,
                            "locale": "en-us",
                            "postalCode": "84101",
                            "timezone": "America/Denver",
                            "city": {
                                "name": "Salt Lake City"
                            },
                            "state": {
                                "name": "Utah",
                                "stateCode": "UT"
                            },
                            "country": {
                                "name": "United States Of America",
                                "countryCode": "US"
                            },
                            "address": {
                                "line1": "301 W. South Temple"
                            },
                            "location": {
                                "longitude": "-111.8992",
                                "latitude": "40.756599"
                            },
                            "dmas": [
                                {
                                    "id": 378
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 64,
                                "ticketmaster": 20,
                                "_total": 84,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/venues/Z6r9jZAk1e?locale=en-us"
                                }
                            }
                        }
                    ],
                    "attractions": [
                        {
                            "name": "Utah Jazz",
                            "type": "attraction",
                            "id": "K8vZ9171o5V",
                            "test": false,
                            "url": "https://www.ticketmaster.com/utah-jazz-tickets/artist/806035",
                            "locale": "en-us",
                            "externalLinks": {
                                "twitter": [
                                    {
                                        "url": "https://twitter.com/utahjazz"
                                    }
                                ],
                                "wiki": [
                                    {
                                        "url": "https://en.wikipedia.org/wiki/Utah_Jazz"
                                    }
                                ],
                                "facebook": [
                                    {
                                        "url": "https://www.facebook.com/utahjazz"
                                    }
                                ],
                                "instagram": [
                                    {
                                        "url": "https://www.instagram.com/utahjazz/"
                                    }
                                ],
                                "homepage": [
                                    {
                                        "url": "https://www.nba.com/jazz/"
                                    }
                                ]
                            },
                            "images": [
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_3_2.jpg",
                                    "width": 640,
                                    "height": 427,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_ARTIST_PAGE_3_2.jpg",
                                    "width": 305,
                                    "height": 203,
                                    "fallback": false
                                },
                                {
                                    "ratio": "4_3",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_CUSTOM.jpg",
                                    "width": 305,
                                    "height": 225,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_PORTRAIT_16_9.jpg",
                                    "width": 640,
                                    "height": 360,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_3_2.jpg",
                                    "width": 1024,
                                    "height": 683,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RECOMENDATION_16_9.jpg",
                                    "width": 100,
                                    "height": 56,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                                    "width": 2048,
                                    "height": 1152,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_RETINA_LANDSCAPE_16_9.jpg",
                                    "width": 1136,
                                    "height": 639,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_TABLET_LANDSCAPE_16_9.jpg",
                                    "width": 1024,
                                    "height": 576,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/a01/dc895acf-863e-4f90-9316-98302e99fa01_1761311_EVENT_DETAIL_PAGE_16_9.jpg",
                                    "width": 205,
                                    "height": 115,
                                    "fallback": false
                                }
                            ],
                            "classifications": [
                                {
                                    "primary": true,
                                    "segment": {
                                        "id": "KZFzniwnSyZfZ7v7nE",
                                        "name": "Sports"
                                    },
                                    "genre": {
                                        "id": "KnvZfZ7vAde",
                                        "name": "Basketball"
                                    },
                                    "subGenre": {
                                        "id": "KZazBEonSMnZfZ7vFJA",
                                        "name": "NBA"
                                    },
                                    "type": {
                                        "id": "KZAyXgnZfZ7v7l1",
                                        "name": "Group"
                                    },
                                    "subType": {
                                        "id": "KZFzBErXgnZfZ7vA7d",
                                        "name": "Team"
                                    },
                                    "family": false
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 43,
                                "ticketmaster": 26,
                                "_total": 69,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/attractions/K8vZ9171o5V?locale=en-us"
                                }
                            }
                        },
                        {
                            "name": "Phoenix Suns",
                            "type": "attraction",
                            "id": "K8vZ9171oZf",
                            "test": false,
                            "url": "https://www.ticketmaster.com/phoenix-suns-tickets/artist/806004",
                            "locale": "en-us",
                            "externalLinks": {
                                "twitter": [
                                    {
                                        "url": "https://twitter.com/Suns"
                                    }
                                ],
                                "wiki": [
                                    {
                                        "url": "https://en.wikipedia.org/wiki/Phoenix_Suns"
                                    }
                                ],
                                "facebook": [
                                    {
                                        "url": "https://www.facebook.com/suns/"
                                    }
                                ],
                                "instagram": [
                                    {
                                        "url": "https://www.instagram.com/suns/"
                                    }
                                ],
                                "homepage": [
                                    {
                                        "url": "https://www.nba.com/suns/"
                                    }
                                ]
                            },
                            "aliases": [
                                "phoenix",
                                "suns",
                                "phoenix suns exchange",
                                "phoenix suns team exchange",
                                "phoenix suns season ticket holders",
                                "phoenix suns season tix holders",
                                "phoenix suns ticket exchange",
                                "suns exchange",
                                "suns season ticket holders",
                                "suns season tix holders",
                                "suns team exchange",
                                "suns ticket exchange"
                            ],
                            "images": [
                                {
                                    "ratio": "4_3",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_CUSTOM.jpg",
                                    "width": 305,
                                    "height": 225,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_PORTRAIT_16_9.jpg",
                                    "width": 640,
                                    "height": 360,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_LARGE_16_9.jpg",
                                    "width": 2048,
                                    "height": 1152,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_EVENT_DETAIL_PAGE_16_9.jpg",
                                    "width": 205,
                                    "height": 115,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_ARTIST_PAGE_3_2.jpg",
                                    "width": 305,
                                    "height": 203,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_16_9.jpg",
                                    "width": 1024,
                                    "height": 576,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_PORTRAIT_3_2.jpg",
                                    "width": 640,
                                    "height": 427,
                                    "fallback": false
                                },
                                {
                                    "ratio": "3_2",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_TABLET_LANDSCAPE_3_2.jpg",
                                    "width": 1024,
                                    "height": 683,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RETINA_LANDSCAPE_16_9.jpg",
                                    "width": 1136,
                                    "height": 639,
                                    "fallback": false
                                },
                                {
                                    "ratio": "16_9",
                                    "url": "https://s1.ticketm.net/dam/a/c62/0636ff21-e369-4b8c-bee4-214ea0a81c62_1339761_RECOMENDATION_16_9.jpg",
                                    "width": 100,
                                    "height": 56,
                                    "fallback": false
                                }
                            ],
                            "classifications": [
                                {
                                    "primary": true,
                                    "segment": {
                                        "id": "KZFzniwnSyZfZ7v7nE",
                                        "name": "Sports"
                                    },
                                    "genre": {
                                        "id": "KnvZfZ7vAde",
                                        "name": "Basketball"
                                    },
                                    "subGenre": {
                                        "id": "KZazBEonSMnZfZ7vFJA",
                                        "name": "NBA"
                                    },
                                    "type": {
                                        "id": "KZAyXgnZfZ7v7l1",
                                        "name": "Group"
                                    },
                                    "subType": {
                                        "id": "KZFzBErXgnZfZ7vA7d",
                                        "name": "Team"
                                    },
                                    "family": false
                                }
                            ],
                            "upcomingEvents": {
                                "tmr": 10,
                                "ticketmaster": 61,
                                "_total": 71,
                                "_filtered": 0
                            },
                            "_links": {
                                "self": {
                                    "href": "/discovery/v2/attractions/K8vZ9171oZf?locale=en-us"
                                }
                            }
                        }
                    ]
                }
            }
        ]
    },
    "_links": {
        "first": {
            "href": "/discovery/v2/events.json?page=0&size=2"
        },
        "self": {
            "href": "/discovery/v2/events.json?size=2"
        },
        "next": {
            "href": "/discovery/v2/events.json?page=1&size=2"
        },
        "last": {
            "href": "/discovery/v2/events.json?page=120052&size=2"
        }
    },
    "page": {
        "size": 2,
        "totalElements": 240106,
        "totalPages": 120053,
        "number": 0
    }
}
```