//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/ex3ndr/Develop/actor-model/library/actor-cocoa-base/build/java/im/actor/model/api/ServiceExContactRegistered.java
//

#ifndef _APServiceExContactRegistered_H_
#define _APServiceExContactRegistered_H_

#include "J2ObjC_header.h"
#include "im/actor/model/api/ServiceEx.h"

@class BSBserValues;
@class BSBserWriter;

@interface APServiceExContactRegistered : APServiceEx

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithInt:(jint)uid;

- (jint)getHeader;

- (jint)getUid;

- (void)parseWithBSBserValues:(BSBserValues *)values;

- (void)serializeWithBSBserWriter:(BSBserWriter *)writer;

- (NSString *)description;

@end

J2OBJC_EMPTY_STATIC_INIT(APServiceExContactRegistered)

FOUNDATION_EXPORT void APServiceExContactRegistered_initWithInt_(APServiceExContactRegistered *self, jint uid);

FOUNDATION_EXPORT APServiceExContactRegistered *new_APServiceExContactRegistered_initWithInt_(jint uid) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT void APServiceExContactRegistered_init(APServiceExContactRegistered *self);

FOUNDATION_EXPORT APServiceExContactRegistered *new_APServiceExContactRegistered_init() NS_RETURNS_RETAINED;

J2OBJC_TYPE_LITERAL_HEADER(APServiceExContactRegistered)

typedef APServiceExContactRegistered ImActorModelApiServiceExContactRegistered;

#endif // _APServiceExContactRegistered_H_
